#include<bits/stdc++.h>
using namespace std;
stack<int> s; 
void Mypush(){
    int x; 
    cout<< "Enter the element to push:"<<endl;
    cin >> x;
    s.push(x);

}  
void display(){
    if(s.empty()){
        cout<<"Stack is empty."<<endl;
        return;
    }
    cout<<"Top element is: "<<s.top()<<endl;

}
void Mypop(){
    if(s.empty()){
        cout<<"Stack is empty, cannot pop."<<endl;
    } else {
        cout<<"Popped element is: "<<s.top()<<endl;
        s.pop();
    }
    
}

int main(){
    while (1){

        
        int option;


        cout<<"-----Main Menu-----"<<endl;
        cout<<"1. Push"<<endl;
        cout<<"2. Pop"<<endl;
        cout<<"3. Display"<<endl;
        cout<<"4. Exit"<<endl;
        cout<<"Enter your option: ";
        cin >> option;
        if(option==4) break;

        switch (option)
        {
            case 1: 
                Mypush();
                break;
            case 2:
                Mypop();
                break;
            case 3:
                display();
                break;
            case 4:
                cout << "Exiting the program." << endl;
                
            default:
                cout << "Invalid option. Please try again." << endl;
               


        }
    }
    

    return 0;
}