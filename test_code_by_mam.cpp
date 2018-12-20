#include<iostream>
#include<math.h>
using namespace std;
int sum(int n,int m)
	{
		int a = -n;
        int b = m;
        return -(a-b);
	}

int main()
{
   // cout<<"the sum is = "<<sum(3,6);
    //return 0;
    int n=5;
    int i,j,k;
    int m;
    cout<<"1\n";
    //paskal triangal
  /*  for(int i=0;i<n;i++)
        {
            m=1;
            for(int j=0;j<n-i;j++)
            {
                cout<<" ";
            }
            for (int k = 0; k <= i; k++)
            {
                cout<<m<<" ";
                m=m*(i-k)/(k+1);
            }
            cout<<"\n";
        }   
*/
    //the amstrong
    string am;
    cout<<"Enter the value = ";
    cin>>am;
    int ch=stoi(am);
    n=am.length();m=0;
    int sum=0;
    for(i=0;i<n;i++)
    {
        m=am.at(i);
        //m-48;
        cout<<am<<"\n";
        cout<<m<<"\n";
        sum=sum + pow(m,3);
        cout<<sum<<"\n";
    }
    if(ch==sum)
    {cout<<"The number is amsrong";}
    
    else{cout<<"number is not armstrong";}
    return 0;
}
