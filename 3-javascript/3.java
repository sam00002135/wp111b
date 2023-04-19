class Matrix 
{
  constructor(matrix) 
  {
    this.matrix = matrix;
  }

  mul(other) 
  {
    const a = this.matrix;
    const b = other.matrix;
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
    return new Matrix(result);
  }
}

