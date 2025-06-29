#include<bits/stdc++.h>
using namespace std;

int main(){
    int a, b;
    try{
        a=10; 
        b=0;
        if(b == 0){
            throw string("Division by zero");
        }
        cout << "Result: " << a/b << endl; 
    }
    catch(string e){
        cout << "Error: " << e << endl;
    }
    return 0;
}