#include<bits/stdc++.h>
using namespace std;

int main(){
    int a, b, c;
    a=10; 
    b=0;
    
    try{
        if(b==0){
            // throw (2);
            throw (2.5);
        }
        c=a/b;
        
        cout<<c<<endl;

    }
    catch(int x){
        cout<<"int: Division by zero is not allowed."<<endl;
        cout<<x<<endl;

    }
    catch(double x){
        cout<<"double: Division by zero is not allowed."<<endl;
        cout<<x<<endl;

    }
    catch(...){   // ... must be the last catch block
        cout<<"Other exception occurred."<<endl;
    }
   
    return 0;
}