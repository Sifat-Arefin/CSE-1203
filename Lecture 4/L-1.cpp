#include<bits/stdc++.h>
using namespace std;

class A {
    protected:
    int ax;
    public:
     A(){
        cout<<"Empty constructor of A called"<<endl;
    }
    // ~A(){
    //     cout<<"Destructor of A called"<<endl;
    // }

    A(int x){
        ax=x;
    }
};

class B: public A {
    protected:
    int bx;
    public:
    B(){
        cout<<"Empty constructor of B called"<<endl;
    }
    // ~B(){
    //     cout<<"Destructor of B called"<<endl;
    // }
    B(int x, int y):A(x){
        bx=y;
    }

};

class D: public B {
    int dx;
    public:
    D(){
        cout<<"Empty constructor of D called"<<endl;
    }
    // ~D(){
    //     cout<<"Destructor of D called"<<endl; // Destructor is called in reverse order of constructor calls
    // }
    D (int x, int y, int z): B(x,y){
        dx=z;   
    }
    void Display(){
        cout<<"Muti="<< ax*bx*dx<<endl;
    }


};

int main(){
    // D d(); // do not work
    // D d;

    D d(5, 10, 20); // force to call parameterized constructor 
                    // important for exam
    d.Display();


    
    
    return 0;
}