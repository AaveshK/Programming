class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d)
    {
    // Write your code here
    List<Integer> ret=new ArrayList<Integer>();
    int N = a.size();
    for(int i=d;i<N+d;i++)
    {
        ret.add(a.get(i%N));
    }
    return ret;
    }
}

/*
Sample Input:

5 4
1 2 3 4 5

Sample Output

5 1 2 3 4
*/