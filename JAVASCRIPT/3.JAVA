function truthTable(n) 
{
  const rows = 2 ** n;
  const table = [];
  for (let i = 0; i < rows; i++) 
  {
    const row = [];
    for (let j = 0; j < n; j++) 
    {
      row.push((i >> j) & 1);
    }
    table.push(row);
  }
  return table;
}

console.log(truthTable(4));  // [[0,0,0,0],[0,0,0,1],[0,0,1,0],[0,0,1,1],[0,1,0,0],[0,1,0,1],[0,1,1,0],[0,1,1,1],[1,0,0,0],[1,0,0,1],[1,0,1,0],[1,0,1,1],[1,1,0,0],[1,1,0,1],[1,1,1,0],[1,1,1,1]]








//參考至chatgpt
function truthTable(n) 
{
  const rows = 2 ** n;
  const table = [];
  for (let i = 0; i < rows; i++) 
  {
    const row = [];
    for (let j = 0; j < n; j++) 
    {
      row.push((i >> j) & 1);
    }
    table.push(row);
  }
  return table;
}

// 測試
console.log(truthTable(2));  // [[0,0],[0,1],[1,0],[1,1]]
console.log(truthTable(3));  // [[0,0,0],[0,0,1],[0,1,0],[0,1,1],[1,0,0],[1,0,1],[1,1,0],[1,1,1]]