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
        return n;
    }
};

int A::n =0;


int A::n=0;
int main(){
    A a(2), b(4), c(6);
    cout<<"N= "<<a.GetN()<<endl;
    
    
    return 0;
}