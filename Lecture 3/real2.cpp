#include<iostream>
using namespace std;

class A{
    public: 
    A(){
    cout<<"Inside A Constuctor "<<endl;
     
    }
     ~A(){
        cout<<"Inside A Destrucor\n";
    }
};
class B : public A{
    public : 
    B(){
        cout<<"Inside B  Constrcutor \n";
   
    }
    ~B(){
        cout<<"Inside B Destrucor\n";
    }

};
class C : public B{
    public : 
    
    C(){
        cout<<"Inside C constructor \n";
    }
    ~C(){
        cout<<"Inside C Destrucor\n";
    }

};
int main(){
    C c;
    

}