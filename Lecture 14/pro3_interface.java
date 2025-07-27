interface IA{
    public void Display();
}
interface IB{
    public void Show();
}
class B implements IA, IB{
    
    public void Display(){
        System.out.println("interface in class B");
    }
    public void Show(){
        System.out.println("interface in class B");
    }

}




public class pro3_interface {
    public static void main(String[]  args){
        B b = new B();
        b.Display();


    }
    

}
