#include <iostream>
using namespace std;

int main()
{
    int arr[2][2];
    for(int i = 0; i<2; i++)
    {
        for(int j = 0; j<2; j++)
        {
            cout<<"Enter value at index number: "<<j<<" ";
            cin>>arr[i][j];
        }
    }
    for(int i = 0; i<2; i++)
    {
        for(int j = 0; j<2; j++)
        {
            cout<<arr[i][j]<<" ";
        }
    }
    
    return 0;
}