// very important for viva
// a class that creates only one object
class Login{

    private static Login obj=null;

    private Login(){
        System.out.println("Obkect Created");

    }
    public static Login getObject(){
        if(obj==null){
            obj= new Login();
        }
        else{
            System.out.println("Sorry object already exits.");
        }
        return obj;
    }

    public static void Display(){
        System.out.println("Your Balance = 1000");
    }

}

public class pro1_singleton_class {

    
    public static void main(String[] args){
        // Login si= new Login(); // error because constructor is private
        Login l= Login.getObject();
        Login l2= Login.getObject();
        


    }

    
}
