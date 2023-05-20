## 4.1 JavaScript 的作用
JavaScript 是一種程式語言，主要用於網頁開發，它可以在瀏覽器中執行並與使用者互動。以下是 JavaScript 的主要作用：

動態網頁效果：JavaScript 可以通過修改網頁元素的屬性和樣式，實現各種動態效果，如按鈕點擊事件、頁面元素的顯示與隱藏、元素的動畫效果等。

表單驗證：通過 JavaScript 可以對使用者輸入的表單數據進行驗證，確保輸入的數據符合要求，例如檢查是否填寫了必填字段、驗證電子郵件地址的格式等。

互動式網頁：JavaScript 可以處理使用者的操作，例如響應按鈕點擊事件、鼠標移動事件等，並根據使用者的行為作出相應的處理，實現互動式的網頁效果。

數據處理和操作：JavaScript 提供了許多內建的數據類型和相關的方法，可以對數字、字符串、數組等進行各種數據處理和操作，例如計算、排序、過濾等。

網頁 API 互動：JavaScript 可以使用瀏覽器提供的 API，與網頁進行交互。這些 API 包括操作網頁文檔的 DOM、發送網路請求、處理服務器返回的數據、操作本地存儲等功能。

## 4.2 JavaScript 基礎語法
JavaScript 的基礎語法包括以下內容：

註釋：使用雙斜線（//）來添加單行註釋，或使用 /* */ 來添加多行註釋，可以幫助開發人員對代碼進行說明和解釋。

變數聲明：使用關鍵字 var、let 或 const 來聲明變數。其中 var 是舊版本的聲明方式，let 和 const 是 ES6 引入的新聲明方式，具有塊級作用域。

賦值：使用等號（=）將值賦給變數。

數據類型：JavaScript 中的基本數據類型包括數字（Number）、字串（String）、布林值（Boolean）、空值（Null）、未定義（Undefined）等。

運算符：JavaScript 支援各種運算符，包括算術運算符（如加法、減法、乘法等）、比較運算符（如等於、大於、小於等）、邏輯運算符（如與、或、非等）、賦值運算符等。

條件語句：使用 if、else if 和 else 來執行不同的程式區塊，根據條件的真假來決定要執行的程式碼。

迴圈：使用 for、while 和 do...while 等迴圈結構來重複執行一段程式碼，直到滿足終止條件。

函式定義：使用 function 關鍵字來定義函式，並指定函式的名稱和參數，函式可以執行特定的任務並返回結果。

物件：JavaScript 是一種基於物件的語言，可以使用物件來組織和管理相關的數據和功能。物件由屬性和方法組成，可以使用點運算符或方括號來訪問它們。

## 4.3 JavaScript 變數與資料型別
在 JavaScript 中，可以使用變數來存儲和操作數據。變數需要聲明並指定一個值，根據所賦予的值，變數的資料型別也會自動推斷或根據聲明來確定。

常見的資料型別包括：

數字（Number）：用於表示數值，包括整數和浮點數。

字串（String）：用於表示文本，需要使用引號（單引號或雙引號）括起來。

布林值（Boolean）：表示真（true）或假（false）。

陣列（Array）：用於存儲多個值，可以通過索引來訪問和修改其中的元素。

物件（Object）：用於組織和存儲多個相關的值和功能，由屬性和方法組成。

空值（Null）：表示變數中沒有值。

未定義（Undefined）：表示變數尚未聲明或尚未賦值。

## 4.4 JavaScript 函式
函式是 JavaScript 中的一個重要概念，它是一段封裝了特定任務或功能的程式碼塊。使用函式可以提高代碼的可讀性和重用性。

在 JavaScript 中，可以使用 function 關鍵字來定義函式。函式可以有一個名稱，也可以是匿名函式。
以下是定義函式的基本語法：

```js
function functionName(parameter1, parameter2, ...) {
  // 函式內的程式碼
  // 可以進行各種操作和計算
  return result; // 可選的回傳值
}
```

其中：

functionName 是函式的名稱，可以自行命名，用於在其他地方呼叫函式。
parameter1, parameter2, ... 是函式的參數列表，用於接收外部傳入的數值或物件。
函式內的程式碼塊用於執行特定的任務或操作。
return 關鍵字後面的表達式是可選的，用於回傳函式的結果。
以下是一個計算兩個數字之和的範例：
```js
function addNumbers(num1, num2) {
  var sum = num1 + num2;
  return sum;
}

var result = addNumbers(5, 3);
console.log(result); // 輸出 8
```

在上面的範例中，addNumbers 函式接收兩個參數 num1 和 num2，將它們相加後回傳結果。通過呼叫 addNumbers(5, 3)，我們將 5 和 3 傳入函式，並將返回的結果存儲在 result 變數中，最後通過 console.log 輸出結果。

函式還可以沒有參數或回傳值，根據需要進行定義和使用。

## 4.5 JavaScript 事件處理
在網頁開發中，事件處理是一個重要的概念。事件指的是在網頁中發生的特定動作，如按鈕點擊、鼠標移動、鍵盤輸入等。使用 JavaScript 可以捕捉這些事件並針對事件進行處理。

要處理事件，可以使用以下步驟：

選取元素：使用 JavaScript 選取要處理事件的 HTML 元素。可以使用 document.getElementById、document.getElementsByClassName 或 document.querySelector 等方法來獲取元素。

添加事件監聽器：使用 addEventListener 方法為元素添加事件監聽器，監聽特定的事件。監聽器是一個函式，當事件發生時，該函式會被執行。

處理事件：在事件監聽器中，可以編寫處理事件的程式碼。這些程式碼可以包括修改元素的屬性、調用其他函式，或執行任何你希望在事件發生時執行的操作。
以下是一個簡單的範例，演示如何使用 JavaScript 處理按鈕點擊事件：

```js
// 選取按鈕元素
var button = document.getElementById("myButton");
// 添加點擊事件監聽器
button.addEventListener("click", function() {
  // 處理點擊事件
  console.log("按鈕被點擊了！");
});
```

在上面的範例中，我們使用 getElementById 方法選取了一個具有 myButton id 的按鈕元素。然後，我們使用 addEventListener 方法為該按鈕元素添加了一個點擊事件監聽器。當按鈕被點擊時，監聽器中的函式將被執行，並在控制台中輸出一條消息。

除了點擊事件之外，還有許多其他事件可以處理，如鼠標移動事件、鍵盤事件、表單提交事件等。使用相應的事件名稱和相應的事件監聽器，你可以捕捉和處理這些事件。

## 4.6 JavaScript DOM 操作
DOM（Document Object Model）是一種用於描述網頁結構的對象模型，它允許 JavaScript 通過操作網頁元素來改變網頁的外觀和行為。

在 JavaScript 中，可以通過 DOM 提供的方法和屬性來操作和操縱網頁元素。以下是一些常見的 DOM 操作：

選取元素：使用 getElementById、getElementsByClassName、querySelector 等方法根據元素的標籤名稱、類名或 id 屬性來選取元素。

修改元素內容：使用 innerHTML 屬性可以修改元素的 HTML 內容，或使用 textContent 屬性來修改元素的純文本內容。

修改元素屬性：使用 setAttribute 方法可以設置元素的特定屬性，或直接修改元素的屬性值。

添加和移除元素：使用 createElement 方法可以創建新的元素，使用 appendChild 或insertBefore 方法可以將元素添加到指定位置。使用 removeChild 方法可以從父元素中移除指定的子元素。

修改元素樣式：使用 style 屬性可以修改元素的樣式。可以直接設置樣式屬性，如 element.style.color = "red"，也可以使用 classList 屬性來添加或移除元素的 CSS 類。

監聽和處理事件：使用 addEventListener 方法為元素添加事件監聽器，並在事件發生時執行相應的處理程式碼。

下面是一個例子，展示如何使用 JavaScript 通過修改 DOM 操縱網頁元素：
```js

// 選取元素
var heading = document.getElementById("myHeading");
// 修改元素內容
heading.innerHTML = "Hello, JavaScript!";

// 修改元素樣式
heading.style.color = "blue";

// 添加事件監聽器
heading.addEventListener("click", function() {
  // 處理點擊事件
  this.style.fontSize = "24px";
});
```

在上面的例子中，我們選取了一個具有 myHeading id 的標題元素，並修改了它的內容和樣式。然後，我們為該元素添加了一個點擊事件監聽器，當該元素被點擊時，監聽器中的函式將被執行，並將標題元素的字體大小修改為 24 像素。

通過使用這些 DOM 操作，JavaScript 可以對網頁元素進行動態的修改和交互，實現豐富的網頁效果和互動性。