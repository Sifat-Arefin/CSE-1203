#include<bits/stdc++.h>
using namespace std;
class impedence{
    int real, img;
    public:
        impedence(){
            real = 0;
            img = 0;
        }
        impedence(int x, int y):real(x), img(y){
          
            
        }

        void show(){
            if(img >= 0){
                cout<<real<<"+j"<<img<<endl;
            }
            else{
                cout<<real<<"-j"<<-img<<endl;
            }
            
        }

        impedence operator+(impedence &imp){  //name of the method +, not operator+
            impedence temp;
            temp.real = real + imp.real;
            temp.img = img + imp.img;

            return temp;

        }

        impedence operator*(impedence &imp){  //name of the method *, not operator*
            impedence temp;
            temp.real = real*imp.real  - img*imp.img;
            temp.img =real*imp.img + img*imp.real;

            return temp;

        }
};



int main(){
    impedence z1(2, 5), z2(2, -3),z3(4,6), z;
    z1.show();
    z2.show();
    z3.show();

    z = z1 + z2 + z3; // Using overloaded + operator
    // z3 = z1(z2)


    cout << "Sum of impedences: ";
    z.show();

    z= z1*z2;
    z.show();
    
    return 0;
}