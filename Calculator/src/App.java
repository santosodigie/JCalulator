import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello, User!");
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

            switch(choice)
            {
                case "1":
                performOperation("Addition");
                break;
                case "2":
                performOperation("Subtraction");
                break;
                case "3":
                performOperation("Multiplication");
                break;
                case "4":
                performOperation("Division");
                break;
                case "5":
                exit = true;
                break;
                default:
                System.out.println("Please enter a valid option!");
            }
        }
    }
    public static void performOperation(String operation){
        System.out.println("You Chose " + operation);
        double num1 = getValidNumber("Please enter the first number: ");
        double num2 = getValidNumber("Please enter the second number: ");

        double result = 0;

        switch(operation)
        {
            case "Addition":
            result = num1 + num2;
            break;
            case "Subtraction":
            result = num1 - num2;
            break;
            case "Multiplication":
            result = num1 * num2;
            break;
            case "Division":
            result = num1 / num2;
            break;

        }

    }

    public static double getValidNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        double number;
        while(true){
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                number = Double.parseDouble(input);
                break; // exiting loop if parsing succeeds
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

        }


        return number;
    }
}
