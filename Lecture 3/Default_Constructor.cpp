#include<bits/stdc++.h>
using namespace std;

class A{
    int x;
    public: 
    
    
    // Default constructor is a constructor that can be called with no arguments.
    //    It is also called a zero-argument constructor.
    A(){
        cout<<"Empty Constructor \n";
    }

    // Parameterized constructor is a constructor that takes arguments.
    // Typically, these arguments help initialize an object's members. 

    A(int m , int n)
    {
       x = m;
       cout<<"Parameterized Constructor \n";
    }

    // Yes, a class in C++ can have multiple constructors. This is known as constructor overloading. 
    // Each constructor must have a unique signature, meaning they must differ in the number or types of their parameters.
    // The compiler determines which constructor to call based on the arguments provided when the object is created.
   
};
int main(){

    A a(2,3);


return 0;
}