function vadd(a, b) 
{
  if (a.length !== b.length) 
  {
    throw new Error('Vectors must have the same length');
  }
  const result = [];
  for (let i = 0; i < a.length; i++)
  {
    result.push(a[i] + b[i]);
  }
  return result;
}

// 測試
console.log(vadd([1, 2, 3], [4, 5, 6])); // [5, 7, 9]
console.log(vadd([1, 2, 3], [-1, -2, -3])); // [0, 0, 0]
