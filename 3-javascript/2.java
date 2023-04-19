function count(list) 
{
  const cmap = {};
  for (let i = 0; i < list.length; i++) 
  
    const word = list[i];
    if (cmap[word]) 
    {
      cmap[word]++;
    } else {
      cmap[word] = 1;
    }
  }
  return cmap;
}

// 測試
const list = ['a', 'dog', 'chase', 'a', 'cat'];
const cmap = count(list);
console.log(cmap); // { a: 2, dog: 1, chase: 1, cat: 1 }
