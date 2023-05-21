const os = require('os');
const readline = require('readline');
const openai = require('openai');

function chatgpt(question, lang, format) {
    const messages = [
        { role: 'system', content: 'You are a chatbot' },
        { role: 'system', content: `Answer in ${lang}` },
        { role: 'system', content: `Format in ${format}` },
        { role: 'user', content: `${question}` }
    ];

    return openai.ChatCompletion.create({
        model: 'gpt-3.5-turbo',
        messages
    }).then((response) => {
        return response.choices[0].message.content;
    });
}

function translate(text, toLang) {
    const messages = [
        { role: 'system', content: 'You are a chatbot' },
        { role: 'system', content: `Answer in ${toLang}` },
        { role: 'system', content: `Format in ${format}` },
        { role: 'user', content: `Translate the following text to ${toLang}\n\n${text}` }
    ];

    return openai.ChatCompletion.create({
        model: 'gpt-3.5-turbo',
        messages
    }).then((response) => {
        return response.choices[0].message.content;
    });
}

openai.api_key = process.env.OPENAI_API_KEY;

const opList = ['quit', 'chatgpt', 'load', 'save', 'shell', 'translate', 'history'];

const narg = process.argv.length;
const user = narg > 2 ? process.argv[2] : 'user';
const lang = narg > 3 ? process.argv[3] : '繁體中文';
const format = narg > 4 ? process.argv[4] : 'Markdown+LaTex, add space before and after $..$';

console.log(`Welcome ${user} to shellgpt. You may use the following commands:`);
console.log('1. chatgpt <question>\n2. load <file>\n3. save <file>\n4. translate\n5. history\n6. quit\n');

let response = null;
let question = null;
const commandList = [];

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    prompt: '\ncommand> '
});

rl.prompt();

rl.on('line', (line) => {
    const command = line.trim();
    console.log('');
    commandList.push(command);
    const args = command.split(' ');
    if (args.length === 0) return;
    const op = args[0];
    const tail = args.slice(1).join(' ');
    if (!opList.includes(op)) {
        console.log(`Operation error, only ${opList} allowed!`);
        rl.prompt();
        return;
    }
    if (op === 'chatgpt') {
        question = tail;
        chatgpt(question, lang, format)
            .then((result) => {
                response = result;
                console.log(response);
                rl.prompt();
            })
            .catch((error) => {
                console.error('Error:', error);
                rl.prompt();
            });
    }
    if (op === 'quit') {
        rl.close();
    }
    if (op === 'shell') {
        os.system(tail);
        rl.prompt();
    }
    if (op === 'load') {
        const fname = args[1];
        
        const fs = require('fs');
        fs.readFile(fname, 'utf-8', (err, data) => {
            if (err) {
                console.error('Error:', err);
                rl.prompt();
            } else {
                response = data;
                console.log(response);
                rl.prompt();
            }
        });
    }
    if (op === 'save') {
        if (response === null) {
            console.log('Error: No response to save!');
            rl.prompt();
        } else {
            const fname = args[1];
            fs.appendFile(fname, response, 'utf-8', (err) => {
                if (err) {
                    console.error('Error:', err);
                } else {
                    console.log('Response saved successfully!');
                }
                rl.prompt();
            });
        }
    }
    if (op === 'translate') {
        const toLang = args[1] || lang;
        translate(response, toLang)
            .then((result) => {
                response = result;
                console.log(response);
                rl.prompt();
            })
            .catch((error) => {
                console.error('Error:', error);
                rl.prompt();
            });
    }
    if (op === 'history') {
        commandList.forEach((cmd, index) => {
            console.log(`${index}: ${cmd}`);
        });
        rl.prompt();
    }
}).on('close', () => {
    console.log('Goodbye!');
    process.exit(0);
});
