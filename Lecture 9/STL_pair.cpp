#include<bits/stdc++.h>
using namespace std;
void display(pair<int, int> p){
    cout<<p.first <<" "<<p.second<<endl;
}

int main(){
    pair<char, int> p1;
    p1= make_pair('A', 10);
    cout << "First element: " << p1.first << endl;  
    cout << "Second element: " << p1.second << endl;

    pair<int, int> p2 ={20, 30};
    display(p2);



    return 0;
}