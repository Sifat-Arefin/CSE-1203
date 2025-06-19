#include<bits/stdc++.h>
using namespace std;

class Player{
    public:
        // virtual void show(){
        //     cout<<"I am a Player"<<endl;
        // }
        virtual void show()=0; // pure virtual function
                                // run time polymorphism

        Player(){
            cout<<"Player constructor called"<<endl;
        }

        
};

class Cricket: public Player{
    public:
        // void show(){
        //     cout<<"I am a Cricket Player"<<endl;
        // }
       Cricket(){
            cout<<"Cricket constructor called"<<endl;
        }
        
};

class Football: public Player{
    public:
        virtual void show()override{
            cout<<"I am a footbal Player"<<endl;
        }
        Football(){
            cout<<"Football constructor called"<<endl;
        }
};



int main(){
    // Player a;  //when a class is contains atleast one pure virtual function , then it is called abstract class 
                    // abstract cannot create any object
    Player *p;
   
    // Cricket c;
    // p = &c; // comliple time a set kora, tai c er address assign hoi ni
    // p->show();

    Football f;
    p=&f;
    p->show();
    
    return 0;
}