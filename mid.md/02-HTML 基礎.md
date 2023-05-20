## 2.1 HTML 簡介
HTML（Hypertext Markup Language）是一種用於建立網頁結構和內容的標記語言。它由一系列的標籤（tags）組成，這些標籤可以告訴瀏覽器如何顯示網頁的不同部分。

## 2.2 TML 文件結構
HTML 文件通常由以下結構組成：

```html
<!DOCTYPE html>
<html>
<head>
    <title>網頁標題</title>
</head>
<body>
    網頁內容
</body>
</html>
```

<!DOCTYPE html>聲明了文件的類型為HTML5。
<html>元素是整個HTML文件的根元素。
<head>元素包含了文件的元信息，例如標題（<title>）、連結到外部樣式表或JavaScript文件的引用等。
<body>元素包含了網頁的實際內容，例如文字、圖片、連結等。

## 2.3 HTML 標籤與元素
HTML 標籤是由尖括號 < 和 > 包圍的關鍵詞，它們用於定義網頁的不同元素。例如，<h1> 是一個標題標籤，用於定義一個一級標題。標籤通常以成對出現，其中包含了開始標籤和結束標籤。
例如：<h1>這是一個一級標題</h1>
在某些情況下，標籤也可以是自我封閉的，這意味著它們沒有結束標籤。
例如，<img> 標籤用於插入圖片，它是一個自我封閉的標籤：
<img src="image.jpg" alt="圖片描述">

## 2.4 HTML 常用標籤
HTML 有許多常用的標籤，這裡列舉一些常見的：

<h1> 到 <h6>：用於定義不同級別的標題。
<p>：用於定義段落。
<a>：用於創建超連結。
<img>：用於插入圖片。
<ul> 和 <li>：用於創建無序列表。
<ol> 和 <li>：用於創建有序列表。
<div>：用於定義文檔中的區塊。
<span>：是一個行內元素，意味著它不會強制換行，而是在同一行中顯示。

## 2.5 HTML 表格
HTML 表格用於展示結構化的數據，它由 <table> 元素開始，並包含多個行和列。
下面是一個簡單的表格示例：
```html
<table>
  <tr>
    <th>姓名</th>
    <th>年齡</th>
    <th>性別</th>
  </tr>
  <tr>
    <td>John</td>
    <td>25</td>
    <td>男</td>
  </tr>
  <tr>
    <td>Jane</td>
    <td>30</td>
    <td>女</td>
  </tr>
</table>
```

在表格中，使用 <tr> 元素定義行，每一行包含多個單元格。在行中，使用 <th> 元素定義表頭單元格，用於列的標題。使用 <td> 元素定義常規單元格，用於數據的展示。

## 2.6 HTML 表單
HTML 表單用於收集用戶輸入的數據，例如文本輸入、選擇框、按鈕等。
下面是一個簡單的表單示例：

```html
<form>
  <label for="name">姓名：</label>
  <input type="text" id="name" name="name"><br><br>
  
  <label for="email">郵箱：</label>
  <input type="email" id="email" name="email"><br><br>
  
  <label for="message">消息：</label>
  <textarea id="message" name="message"></textarea><br><br>
  
  <input type="submit" value="提交">
</form>
```

在表單中，使用 <form> 元素來包裹表單的內容。<label> 元素用於定義表單控件的標籤。<input> 元素用於創建各種不同類型的輸入控件，例如文本輸入框、郵箱輸入框等。<textarea> 元素用於創建多行文本輸入框。最後，使用 <input type="submit"> 元素創建提交按鈕。