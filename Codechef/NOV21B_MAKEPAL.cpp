#include <bits/stdc++.h>
using namespace std;
#include <stdio.h>

int solver(int arr[], int N)
{
    int odd = 0;
    for(int i = 0; i < N; i++)
        if((arr[i] & 1) != 0)
            odd++;
    if(odd <= 1)
        return 0;
    else
        return odd/2;
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
        int n;
        cin>>n;
        int ar[n];
        for(int i = 0; i < n; i++)
            cin>>ar[i];
        cout<<solver(ar,n)<<"\n";
    }
    return 0;
}