//
// Created by mustafa on 8/6/22.
//
#include <bits/stdc++.h>
#include <string>
using namespace std;



int main()
{
    string S;
    getline(cin, S);
  try{
    int i = stoi(S);
    cout<<i;
    }
  catch(exception)
  {
    cout<<"Bad String"<<endl;
  }
    return 0;
}
