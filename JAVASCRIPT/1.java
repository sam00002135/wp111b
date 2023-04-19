function isPrime(num) 
{
  if (num === 2) 
  {
    return true;
  }
 
  if (num < 2) 
  {
    return false;
  }

  for (let i = 2; i < num; i++) 
  {
    if (num % i === 0) 
    {
      return false;
    }
  }

  return true;
}

console.log(isPrime(2));    // true
console.log(isPrime(3));    // true
console.log(isPrime(4));    // false
console.log(isPrime(17));   // true
console.log(isPrime(100));  // false