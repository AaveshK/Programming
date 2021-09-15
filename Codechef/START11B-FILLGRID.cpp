#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int ar[n][n];
	    for(int i = 0; i < n; i++)
	    {
	        for(int j = 0; j < n; j++)
	        {
	            ar[i][j] = -1;
	        }
	    }
	    if(n % 2 != 0)
	    {
	        for(int i = 0; i < n; i++)
	            ar[i][i] = 1;
	    }
	    for(int i = 0; i < n; i++)
	    {
	        for(int j = 0; j < n; j++)
	            cout<<ar[i][j]<<" ";
	        cout<<"\n";
	    }
	}
	return 0;
}
