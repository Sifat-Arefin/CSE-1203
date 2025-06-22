#include<iostream>
using namespace std;
class A{

    int x;
    int y;
    public :
    A (){
        cout<<"Empty Constructor \n";
    }
    A(int m , int n)
    {
       x = m;
       y =n;
       
    }
    A (A *p){
         x= p->x;
         y= p->y;
         cout<<"Copy Constructor \n";
       
    }
    void GetX(){
        cout<<"x = "<<x<<" y = "<<y<<endl;
    }

    
};

class B{

};

int main(){

   
 A a(2,3);
 A b = a;




   
}