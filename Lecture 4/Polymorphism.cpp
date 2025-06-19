#include<bits/stdc++.h>
using namespace std;
class A{
    protected: int ax;
    public:
    // A(){
    //     cout<<"Empty"<<endl;
    // }
    int sum(int x){
        cout<<"One argument"<<endl;
        return x;
    }
    int sum(int x, int y){
        cout<<"integer sum"<<endl;
        return x+y;
    }
    float sum(double x, float y){
        cout<<"double sum"<<endl;
        return x+y;
    }

};


void hello(){
   cout<<"Thank you "<<endl;
}

int hello (int x){
    return x+1;

}

int main(){
    A a;
    cout<<"Sum is: "<<a.sum(2,5)<<endl;
    cout<<"Sum is: "<<a.sum(2.2,5.5)<<endl;
    cout<<"Sum is: "<<a.sum(2)<<endl; // This will call the first sum function with one argument
    hello();
    cout<<hello(5)<<endl;


    
    return 0;
}