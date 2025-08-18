
class T1 implements Runnable{
    public void run(){
        System.out.println("Hello " + Thread.currentThread().getName());
    }
    
}

public class Sifat {
    public static void main(String[] args){
        T1 t = new T1();
        Thread my_si = new Thread(t);
        my_si.start();

    }
    
}
