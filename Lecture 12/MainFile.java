import java.util.Scanner;

public class MainFile{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is a simple Java program.");
        System.out.println("It prints messages to the console.");
        System.out.println("Learning Java is fun!");
        System.out.print("Love Ruet");
        System.out.println("Love CSE");

        Scanner input = new Scanner(System.in);
        int a, b,c;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
        input.close();
    }
}