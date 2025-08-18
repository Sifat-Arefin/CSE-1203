class A{
    private int x;
    public A(){
        System.out.println("Inside empty constructor.");
    }
    public A(int x){
        this.x =x;
        System.out.println("Inside parameterized of A.");
    }
    public int Getx(){
        return x;
    }
    public void Show(){
        System.out.println("Inside of A show()");
    }
    public void sifat(){
        System.out.println("hello");
    }
   
}

class B extends A{
        private int y;
        public B(int y){
            this.y =y;
            System.out.println("Inside parameterized of B.");
        }
        public B(int x, int y){
            super(x);
            this.y =y;
            System.out.println("Inside  2 parameterized of B.");


        }
        public int Gety(){
            return y;
        }
        public void sum(){
            System.out.println("sum= " + (y+ Getx()));
        }
        
        public void Show(){
            super.Show();
            sifat();
            
            System.out.println("Inside of B show()");
        }
        
    }

public class pro3_Inheritance {
    public static void main(String[] args){

    
    B b = new B(11);
    B b2 = new B(3,4);
    b.sum();

    b2.sum();

    b2.Show();

    }
    
}
