#include <bits/stdc++.h>
using namespace std;
#include <stdio.h>

bool solver(int x, int y)
{
    if((x & 1) != 0)
    return false;
    if((y & 1) != 0)
    {
        if(x < 2)
            return false;
    }
    return true;
}
int main()
{
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif
    int t;
    cin>>t;
    while(t--)
    {
        int x,y;
        cin>>x>>y;
        cout<< (solver(x,y) == true ? "YES" : "NO")<<"\n";
    }
    return 0;
}