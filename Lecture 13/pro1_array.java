import java.util.ArrayList;
import java.util.Arrays;

public class pro1_array {
    public static void main(String [] args) {
        int [] arr= new int[] {1, 2, 3, 4, 5};
        System.out.println("Array 1st elements: " + arr[0]);

        arr[0]= 23;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
       
        fruits.sort(null);
       
        System.out.println(fruits);

        // fruits.get(2)= "Orange"; // This line is incorrect, should use set method
        fruits.set(2, "Orange");
        System.out.println(fruits.get(2));

        fruits.remove(1);
        System.out.println(fruits);

        

    }
     
}
