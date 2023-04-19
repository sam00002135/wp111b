function vdot(a, b) 
{
  if (a.length !== b.length) 
  {
    throw new Error('Vectors must have the same length');
  }
  let result = 0;
  for (let i = 0; i < a.length; i++) 
  {
    result += a[i] * b[i];
  }
  return result;
}

// 測試
console.log(vdot([1, 2, 3], [4, 5, 6])); // 32
console.log(vdot([1, 2], [3, 4])); // 11
