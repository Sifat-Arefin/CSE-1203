#include<bits/stdc++.h>
using namespace std;
class A{
    int x,y;
    double a,b;
    public:
    int sum(int m, int n){
        int t;
        x= m; 
        y=n;
        t=x+y;
        return t;
    }
    double sum(double m, double n){
        
        return m+n;
        
    }
};
int main(){
    A a;
    // cout<<"Sum= "<<a.sum(3,4)<<endl;
    cout<<"Sum= "<<a.sum(3.3,4.4)<<endl;
    
    return 0;
}