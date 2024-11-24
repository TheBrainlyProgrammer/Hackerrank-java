//https://www.spoj.com/problems/TEST/
#include <bits/stdc++.h>
using namespace std;

int main(){
    string k="";
    while(1){
        int a;
        cin >>a;
        if (a==42) break;
        k+=to_string(a)+"\n";
    }
    cout <<k<<endl;
}