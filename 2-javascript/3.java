function madd(a, b) 
{
  if (a.length !== b.length || a[0].length !== b[0].length) 
  {
    throw new Error('Matrices must have the same dimensions');
  }
  const result = [];
  for (let i = 0; i < a.length; i++) 
  {
    result.push([]);
    for (let j = 0; j < a[0].length; j++) 
    {
      result[i].push(a[i][j] + b[i][j]);
    }
  }
  return result;
}

// 測試
console.log(madd([[1, 2], [3, 4]], [[5, 6], [7, 8]])); // [[6, 8], [10, 12]]
console.log(madd([[1, 1], [1, 1]], [[-1, -1], [-1, -1]])); // [[0, 0], [0, 0]]
