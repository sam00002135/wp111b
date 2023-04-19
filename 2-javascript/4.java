function mmul(a, b) 
{
  if (a[0].length !== b.length) 
  {
    throw new Error('Number of columns in matrix A must equal number of rows in matrix B');
  }
  const result = [];
  for (let i = 0; i < a.length; i++) 
  {
    result.push([]);
    for (let j = 0; j < b[0].length; j++) 
    {
      let sum = 0;
      for (let k = 0; k < b.length; k++) 
      {
        sum += a[i][k] * b[k][j];
      }
      result[i].push(sum);
    }
  }
  return result;
}

// 測試
console.log(mmul([[1, 2], [3, 4]], [[5, 6], [7, 8]])); // [[19, 22], [43, 50]]
console.log(mmul([[1, 0], [0, 1]], [[-1, -1], [-1, -1]])); // [[-1, -1], [-1, -1]]
