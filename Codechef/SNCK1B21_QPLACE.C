#include <bits/stdc++.h>
#include <iostream>
using namespace std;
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
        int n;
        cin>>n;
        char ch[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                ch[i][j] = '.';
            }
        }
        int mid = n/2;
        for(int i = 1; i < n-1; i++)
            ch[i][mid] = 'Q';
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                cout<<ch[i][j];
            }
            cout<<"\n";
        }
    }
    return 0;
}