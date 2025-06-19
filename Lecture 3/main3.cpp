#include<iostream>
using namespace std;
class A{// Father 

    private :
     int x = 10;
    protected :
    int y = 20;
    public : 
    int z= 30;
};

class B :  public  A{// Child 

 
};

class C  : public B{
public: 
 void Display(){
    // cout<<"x = "<<x<<endl;// private data member cannot be accessed
    cout<<"y = "<<y<<endl;
    cout<<"z = "<<z<<endl;
 }

};


int main(){

  C c ;
  c.Display();
//   cout<<"x = "<<b.x<<endl;
//   cout<<"y = "<<b.y<<endl;// it is a protected 
//   cout<<"z = "<<b.z<<endl;


}