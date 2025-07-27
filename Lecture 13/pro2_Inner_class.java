class A{
    private int x;

    class B{
        private int y;
        public B(int y){
            this.y =y;
        }
        public int Gety(){
            return y;
        }
        public void sum(){
            System.out.println(y+ Getx());
        }
    }

    public A(int a){
        x=a;
    }
    public int Getx(){
        return x;
    }
}



public class pro2_Inner_class {
    
    public static void main(String[] args){
        A a= new A(10);
        System.out.println(a.Getx());
        A.B b= new A(23).new B(20);
        System.out.println("y=" + b.Gety());

        b.sum();
    }
}
