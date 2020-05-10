import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    
    public static Scanner in = new Scanner(System.in);
    
    public static int integerInput(String variableName) {
        int input = 0;
        boolean validInput = false;
        System.out.println("Enter the " + variableName);
        while(validInput == false) {
            try {
                input = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer type input");
            }
            finally {
                in.nextLine();
            }
        }
        return input;
    }

    public static long longInput(String variableName) {
        long input = 0;
        boolean validInput = false;
        System.out.println("Enter the " + variableName);
        while(validInput == false) {
            try {
                input = in.nextLong();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer type input");
            }
            finally {
                in.nextLine();
            }
        }
        return input;
    }

    public static double doubleInput(String variableName) {
        double input = 0.0;
        boolean validInput = false;
        System.out.println("Enter the " + variableName);
        while(validInput == false) {
            try {
                input = in.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a decimal value");
            }
            finally {
                in.nextLine();
            }
        }
        return input;
    }

    public static String stringInput(String variableName) {
        String input;
        System.out.println("Enter the " + variableName);
        input = in.nextLine();
        return input;
    }
}