#include <bits/stdc++.h>

    using namespace std;

int main()
{
    int count=0,rount=0,i,n;
   string joy;
   cin>>n;
   cin>>joy;
    for(i=0;i<n;i++)
    {
        if(joy[i]=='A')
            count++;
        else
            rount++;
    }
    if(count>rount)
        cout<<"Anton"<<endl;
        else if(rount>count)
            cout<<"Danik"<<endl;
        if(count==rount)
        cout<<"Friendship"<<endl;
}