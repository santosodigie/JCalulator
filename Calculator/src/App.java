import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello, Gang!");
        System.out.println("Welcome to my simple Calculator App in Java");

        boolean exit = false;

        while(!exit){
            System.out.println("_____________________________________________________");
            System.out.println("Please select an option!");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            String choice = myObj.nextLine();
        }
    }
    
}
