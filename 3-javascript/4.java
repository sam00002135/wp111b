class Matrix {
  constructor(m) 
  {
    this.m = m;
  }

  add(b) {
    if (this.m.length !== b.m.length || this.m[0].length !== b.m[0].length) 
    {
      throw new Error('Matrices must have the same dimensions');
    }
    const result = [];
    for (let i = 0; i < this.m.length; i++) 
    {
      result.push([]);
      for (let j = 0; j < this.m[0].length; j++) 
      {
        result[i].push(this.m[i][j] + b.m[i][j]);
      }
    }
    return new Matrix(result);
  }

  mul(b)
  {
    if (this.m[0].length !== b.m.length) 
    {
      throw new Error('Number of columns in matrix A must equal number of rows in matrix B');
    }
    const result = [];
    for (let i = 0; i < this.m.length; i++) 
    {
      result.push([]);
      for (let j = 0; j < b.m[0].length; j++) 
      {
        let sum = 0;
        for (let k = 0; k < b.m.length; k++) 
        {
          sum += this.m[i][k] * b.m[k][j];
        }
        result[i].push(sum);
      }
    }
    return new Matrix(result);
  }
}