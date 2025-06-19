#include<iostream>
using namespace std;
class MyBank{
    private:
        int ano;
        float balance;

    public:
        MyBank(int n, float b){ // constructor
            ano = n;
            balance = b;
        }
        void SetData(int n, float b){
            ano = n;
            balance = b;
        }

        float GetBalance(){
            return balance;
        }

};
int main(){
    // MyBank acc1, acc2, acc3, acc4, acc5;
    // acc1.SetData(100, 5000.50);
    // acc2.SetData(200, 7400.5);

    // acc3.SetData(300, 10000.0);
    // acc4.SetData(400, 20000.0);
    // acc5.SetData(500, 30000.0);
    MyBank acc9(110,500);

    cout<<"Enter your Acount No: "<<endl;
    int x;
    cin>>x;


    // if(x==100){
    //     cout<<"Your Balance is: "<<acc1.GetBalance()<<endl;
    // }
    // else if(x==200){
    //     cout<<"Your Balance is: "<<acc2.GetBalance()<<endl;
    // }
    // else if(x==300){
    //     cout<<"Your Balance is: "<<acc3.GetBalance()<<endl;
    // }
    // else if(x==400){
    //     cout<<"Your Balance is: "<<acc4.GetBalance()<<endl;
    // }
    // else if(x==500){
    //     cout<<"Your Balance is: "<<acc5.GetBalance()<<endl;
    // }
    // else{
    //     cout<<"Account Not Found!"<<endl;
    // }
    
    if(x==110){
        cout<<"Your Balance is: "<<acc9.GetBalance()<<endl;
    }
    
    
    return 0;
}