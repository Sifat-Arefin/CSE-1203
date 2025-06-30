#include<bits/stdc++.h>
using namespace std;

int main(){
    tuple<int, string, double> t1;
    t1=make_tuple(100, "Kamal", 3.5);
    cout<<get<0>(t1)<<endl;
    cout<<get<1>(t1)<<endl;
    cout<<get<2>(t1)<<endl;

    get<2>(t1)=3.7;

    tuple<int, string, double> t2;
    t2=make_tuple(200, "Rahim", 4.0);
    cout<<get<0>(t2)<<" "<<get<1>(t2)<<" "<<get<2>(t2)<<endl;
    t2.swap(t1); 
    cout<<get<0>(t2)<<" "<<get<1>(t2)<<" "<<get<2>(t2)<<endl;   

    return 0;
}