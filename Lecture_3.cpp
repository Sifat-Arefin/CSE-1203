#include<bits/stdc++.h>
using namespace std;

class A{
    int x;
    static int n;
    public:
    A(int a){
        x=a;
        n++;
    }
    int GetN(){
        return x;
    }
};

int A:: n=0;


int main(){
    A a(2), b(4);

    cout<<"n= "<<a.GetN()<<endl;
    
    return 0;
}