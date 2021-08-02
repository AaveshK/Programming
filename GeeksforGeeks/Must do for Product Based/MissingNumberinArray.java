class Solution
{
    int MissingNumber(int array[], int n)
    {
        // Your Code Here
        int sumAr = 0;
        int sum = ((n)*(n+1))/2;
        n=n-1;
        while(--n >= 0)
            sumAr+=array[n];
        return sum-sumAr;
    }
}