#include<bits/stdc++.h>
using namespace std;

int main(){
    // int ax[5]={ 4,5,1,10,4};
    array<int,5> ax= {2,5,10,0,12};
    int x;
    try{      
        x=ax.at(10);
        cout<<x;
    }
    catch(exception e){
        cout<<"Out of array bounds exception occurred."<<endl;
    }
    return 0;
}