//
// Created by mustafa on 8/7/22.
//

#include <cmath>
#include <iostream>
#include <exception>
#include <stdexcept>

using namespace std;

//Write your code here
class Calculator
{
public:
    int power(int x, int y)
    {
        string err = "n and p should be non-negetive";
        if(x<0)
        {
            throw invalid_argument("n and p should not be non-negetive");
        }
        else if(y<0)
        {
            throw invalid_argument("n and p should not be non-negetive");
        }
        return pow(x,y);
    }
    Calculator()
    {

    }
};

int main()
{
    Calculator myCalculator=Calculator();
    int T,n,p;
    cin>>T;
    while(T-->0){
        if(scanf("%d %d",&n,&p)==2){
            try{
                int ans=myCalculator.power(n,p);
                cout<<ans<<endl;
            }
            catch(exception& e){
                cout<<e.what()<<endl;
            }
        }
    }

}