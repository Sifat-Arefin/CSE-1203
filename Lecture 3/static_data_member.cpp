#include<bits/stdc++.h>
using namespace std;

class suz{
    public:
    static int n;
    suz(){
        n++;
    }

    int sifat(){
        n= n+5;
        return n;
    }
        
};
int suz::n=11;

int main(){
    suz s;
    cout<<s.n<<endl;   // static member can be accessed using object

    cout<<suz::n<<endl; // static member can be accessed using class name, scope resolution operator

    cout<<s.sifat()<<endl; 
    
    return 0;
}