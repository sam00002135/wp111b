## 6.1 建立基礎 HTML 結構
HTML是網頁的基礎，用於結構化和呈現網頁內容。在建立網站時，我們需要建立基礎的HTML結構。
以下是一個簡單的HTML範例：
```html
<!DOCTYPE html>
<html>
<head>
    <title>我的網站</title>
</head>
<body>
    <header>
        <h1>歡迎來到我的網站</h1>
    </header>

    <nav>
        <ul>
            <li><a href="#">首頁</a></li>
            <li><a href="#">關於我們</a></li>
            <li><a href="#">聯繫我們</a></li>
        </ul>
    </nav>

    <main>
        <section>
            <h2>關於我們</h2>
            <p>這是一個關於我們的網頁部分。</p>
        </section>

        <section>
            <h2>最新消息</h2>
            <p>這是最新消息的網頁部分。</p>
        </section>
    </main>

    <footer>
        <p>版權所有 &copy; 2023 我的網站</p>
    </footer>
</body>
</html>
```
這個範例中，我們建立了一個簡單的網站結構。<header>元素包含網站的標題，<nav>元素包含網站的導航列，<main>元素包含主要內容，<footer>元素包含網站的頁腳。<h1>到<h6>元素用於標題，<p>元素用於段落，<ul>和<li>元素用於無序列表。你可以根據你的需要修改和擴展這個基礎結構。

## 6.3 使用 CSS 優化網站外觀
CSS是一種用於控制網頁外觀和布局的語言。使用CSS可以使網站更具吸引力並提供更好的用戶體驗。
以下是一個示例，展示如何使用CSS優化網站的外觀：

```html
<!DOCTYPE html>
<html>
<head>
    <title>我的網站</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #f2f2f2;
        }
                nav li {
            float: left;
        }

        nav li a {
            display: block;
            color: #333;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        nav li a:hover {
            background-color: #ddd;
        }

        main {
            margin: 20px;
        }

        section {
            margin-bottom: 20px;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
    <header>
        <h1>歡迎來到我的網站</h1>
    </header>

    <nav>
        <ul>
            <li><a href="#">首頁</a></li>
            <li><a href="#">關於我們</a></li>
            <li><a href="#">聯繫我們</a></li>
        </ul>
    </nav>

    <main>
        <section>
            <h2>關於我們</h2>
            <p>這是一個關於我們的網頁部分。</p>
        </section>

        <section>
            <h2>最新消息</h2>
            <p>這是最新消息的網頁部分。</p>
        </section>
    </main>

    <footer>
        <p>版權所有 &copy; 2023 我的網站</p>
    </footer>
</body>
</html>

```

在上面的範例中，我們使用CSS來樣式化網站的外觀。這包括設定body元素的字體和樣式，header和footer元素的背景色和顏色，nav元素和其中的連結的樣式，以及main和section元素的外邊距和間距。你可以根據你的需求自由調整CSS屬性，以達到你想要的外觀效果。

## 6.4 利用 JavaScript 添加互動功能
JavaScript是一種用於網頁互動和動態效果的程式語言。
以下是一個示例，展示如何使用JavaScript添加互動功能到網站中：

```html
<!DOCTYPE html>
<html>
<head>
    <title>我的網站</title>
    <style>
        /* CSS樣式 */
    </style>
</head>
<body>
    <header>
        <h1>歡迎來到我的網站</h1>
    </header>

    <nav>
        <ul>
            <li><a href="#">首頁</a></li>
            <li><a href="#">關於我們</a></li>
            <li><a href="#">聯繫我們</a></li>
        </ul>
    </nav>

    <main>
        <section>
            <h2>關於我們</h2>
            <p>這是一個關於我們的網頁部分。</p>
<button onclick="toggleVisibility()">顯示/隱藏</button>
<div id="content" style="display: none;">
<p>這是隱藏的內容。</p>
</div>
</section>
    <section>
        <h2>最新消息</h2>
        <ul id="news-list">
            <li>新聞項目1</li>
            <li>新聞項目2</li>
            <li>新聞項目3</li>
        </ul>
        <button onclick="addNewsItem()">新增新聞項目</button>
    </section>
</main>

<footer>
    <p>版權所有 &copy; 2023 我的網站</p>
</footer>

<script>
    function toggleVisibility() {
        var content = document.getElementById("content");
        if (content.style.display === "none") {
            content.style.display = "block";
        } else {
            content.style.display = "none";
        }
    }

    function addNewsItem() {
        var newsList = document.getElementById("news-list");
        var newItem = document.createElement("li");
        newItem.textContent = "新聞項目4";
        newsList.appendChild(newItem);
    }
</script>
</body>
</html>
```

在上面的範例中，我們使用JavaScript添加了一些互動功能。toggleVisibility()函數用於在點擊按鈕時切換內容的顯示和隱藏。addNewsItem()函數用於在點擊按鈕時新增一個新聞項目到列表中。這些函數是通過設置按鈕的onclick屬性來觸發的。

你可以根據需要添加更多的JavaScript功能來實現更豐富的互動體驗，例如表單驗證、動態效果和使用AJAX進行數據交互等。

## 6.5 使用 Deno 構建伺服器端應用程式

Deno是一個現代的JavaScript和TypeScript運行時，用於構建伺服器端應用程式。
以下是一個簡單的使用Deno構建伺服器端應用程式的範例：

```js
import { serve } from 'https://deno.land/std/http/server.ts';

const server = serve({ port: 8000 });
console.log('伺服器運行於 http://localhost:8000/');

for await (const request of server) {
    const url = request.url;

    if (url === '/') {
        request.respond({ body: '歡迎來到我的網站' });
    } else if (url === '/about') {
        request.respond({ body: '關於我們的頁面' });
    } else {
        request.respond({ body: '找不到頁面' });
    }
}
```
在上面的範例中，我們使用Deno的serve函數建立了一個簡單的伺服器，監聽在本地的8000端口。當有請求到達時，我們根據URL路徑做出相應的回應。

如果URL是/，則返回一個歡迎訊息。如果URL是/about，則返回關於我們的頁面。對於其他未知的URL，返回一個找不到頁面的訊息。

你可以根據你的需求擴展這個應用程式，例如添加更多的路由和處理不同類型的請求。Deno還提供了許多內置模塊和第三方模塊，可以幫助你構建更複雜的伺服器端應用程式，例如處理資料庫連接、驗證和授權等。

注意：在執行上述程式碼之前，你需要安裝Deno運行時。請參考Deno官方文件以了解更多詳細資訊和指示。