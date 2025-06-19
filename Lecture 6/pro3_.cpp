#include<bits/stdc++.h>
using namespace std;
class Car{
    int speed;
    public:
        Car(){
            speed=0;
        }
        int getSpeed(){
            return speed;
        }
        void operator++(){
            speed+=5;
        }
        void operator--(){
            speed-=5;
        }
};

int main(){
    Car c1;
    ++c1;
    cout<<c1.getSpeed()<<endl;

    --c1;
    cout<<c1.getSpeed()<<endl;

    
    return 0;
}