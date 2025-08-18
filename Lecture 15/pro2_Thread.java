// multiple tasks are done simultanously

class A extends Thread{
    public void run(){
        // Abstract method from Thread Class : Overriding
        for (int i=0; i<10 ; i++)
        System.out.println("MUsic Thread running "+i);
    }
}
//simultanously Multiple thread running
class B extends Thread{
    public void run(){
        // Abstract method from Thread Class : Overriding
        for (int i=0 ; i< 10; i++)
        System.out.println("Video Thread running "+ i);
    }
}
class C extends Thread{
    public void run(){
        // Abstract method from Thread Class : Overriding 
        for(int i=0;i <10; i++)
        System.out.println("Clock Thread running "+i);
    }
} 


public class pro2_Thread {

    public static void main(String [] args){
        A a= new A();
        B b= new B();
        C c =new C();
        a.start();
        b.start();
        c.start();



    }
    
}
