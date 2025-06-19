#include<bits/stdc++.h>
using namespace std;
class Rupali; // Forward declaration of Rupali class
class Agrani{
    int balance;
    public:
        Agrani(int x):balance(x){
           
        }
    friend void sum(Agrani a, Rupali r);

};

class Rupali{
    int balance;
    public:
        Rupali(int x):balance(x){
           
        }
        friend void sum(Agrani a, Rupali r);
        
        // Friend function to access private members of Agrani
        // friend void transfer(Agrani &a, Rupali &r);
};
void sum(Agrani a, Rupali r){
    int s= a.balance + r.balance;
    cout << "Sum of balances: " << s << endl;
}

int main(){
    Agrani ag(2000);
    Rupali ru(4000);
    sum(ag, ru);

    
    return 0;
}