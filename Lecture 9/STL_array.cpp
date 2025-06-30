#include<bits/stdc++.h>
using namespace std;
array<int, 5> ax;
void display(){
    for(int i=0; i<ax.size(); i++){
        cout << ax[i] << " ";
    }
    cout << endl;
}

int main(){
    ax={2,5,2,10,0};
    display();

    cout<<ax.front()<<endl;
    cout<<ax.back()<<endl;
    ax.fill(10);
    display();

    
    return 0;
}