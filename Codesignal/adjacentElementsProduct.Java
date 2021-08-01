int adjacentElementsProduct(int[] inputArray)
{
    int N = inputArray.length;
    int prod=0;
    int prod_max=Integer.MIN_VALUE;
    for(int i=1; i<N; i++)
    {
        prod = inputArray[i-1] * inputArray[i];
        if(prod>prod_max)
            prod_max = prod;
    }
    return prod_max;
}