int shapeArea(int n)
{
    int num = n;
    n = 2*n-1;
    int area = n*n;
    num = num-1;
    area = area - 4*(num * (num+1)/2 );
    return area;
}