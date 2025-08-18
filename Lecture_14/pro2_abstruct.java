

// Difference between abstruct class and interface
// interface in 100% abstruct class but abstruct class in partial abstruction 

abstract class A {
    public abstract void Display();
    public void Show() {
        System.out.println("Show method in abstract class A");
    }
}

abstract class B extends A{
    // public void Display(){
    //     System.out.println("Display method in class B");
    // }
    public abstract void Display(); // This is an abstract method, must be implemented in subclass
}

class C extends B{
    public void Display(){
        System.out.println("Display method in class C");

    }
    

}


public class pro2_abstruct {
    public static void main(String[]  args){
        // A a = new A();
        // a.Display();
        // a.Show();

        // B b = new B();
        // b.Display();
        // b.Show();

        C c = new C();
        c.Display();
        c.Show();


    }
    

}
