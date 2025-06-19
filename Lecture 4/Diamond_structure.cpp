#include<bits/stdc++.h>
using namespace std;

class A {
    protected:
    int ax;
    public:
     A(){
        cout<<"Empty constructor of A called"<<endl;
        ax=0;
    }
    // ~A(){
    //     cout<<"Destructor of A called"<<endl;
    // }

    A(int x){
        ax=x;
    }
};

class B: virtual public A {
    protected:
    int bx;
    public:
    B(){
        cout<<"Empty constructor of B called"<<endl;
        ax=1;
    }
    // ~B(){
    //     cout<<"Destructor of B called"<<endl;
    // }
    B(int x){
        bx=x;
    }

}; 
class C: virtual public A {
    protected:
    int cx;
    public:
    C(){
        cout<<"Empty constructor of C called"<<endl;
        ax=2;
    }
    // ~B(){
    //     cout<<"Destructor of B called"<<endl;
    // }
    C(int x){
        cx=x;
    }

};

class D: public C, public B{
    int dx;
    public:
    D(){
        cout<<"Empty constructor of D called"<<endl;
    }
    // ~D(){
    //     cout<<"Destructor of D called"<<endl; // Destructor is called in reverse order of constructor calls
    // }
    D (int x){
        dx=x;   
    }
    void Display(){
        cout<<"ax="<< ax<<endl;
    }


};

int main(){
    // D d(); // do not work
    // D d;

    // D d(5, 10, 20); // force to call parameterized constructor 
                    // important for exam
    // d.Display();


    D d;
    d.Display();




    
    
    return 0;
}