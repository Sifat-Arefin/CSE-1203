#include<bits/stdc++.h>
using namespace std;
template <typename T, typename D>class A{
    T x,y;
 
    public:
    D sum(T m, D n){
        D t;
        x= m; 
        y=n;
        t=x+y;
        return t;
    }  
    
};
int main(){
    // A <int> a;
    // cout<<"Sum= "<<a.sum(2,4)<<endl;

    // A<double> b;

    // cout<<"Sum= "<<b.sum(3.3,4.4)<<endl;

    A <int, double>a ;
   cout<<"Sum= "<<a.sum(2,4.4)<<endl;
    
    return 0;
}