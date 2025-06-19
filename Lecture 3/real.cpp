#include<iostream>
using namespace std;
class A{
    public: int num1;
    protected : int num2;
    private : int num3;

};

class B : public A{


};

class C : public B{
    public : 
    void Display(){
        // cout<<" x = "<<x<<endl;
        // cout<<" y = "<<y<<endl;
        // cout<<" z = "<<z<<endl;
    }

};
int main(){

   C c;
   c.Display();
//    cout<<" x = "<<c.x<<endl;
//    cout<<" y = "<<c.y<<endl;
//    cout<<" z = "<<c.z<<endl;

}