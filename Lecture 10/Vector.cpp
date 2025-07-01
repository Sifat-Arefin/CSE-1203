#include<bits/stdc++.h>
using namespace std;
vector<int> v;
void display() {
    if (v.empty()) {
        cout << "Vector is empty." << endl;
        return;
    }
    cout << "Elements in the vector: ";
    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    cout << endl;
}

int main(){
    v.push_back(10);
    v.push_back(20);
    v.push_back(30);
    display();
    v.pop_back();
    display();

    for(auto p=v.begin(); p<v.end(); p++){
        if(*p ==20){
            v.insert(p, 55);
        }

    }
    display();

    return 0;
}