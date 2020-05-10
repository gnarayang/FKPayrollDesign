import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IOHandler {
    
    public static Scanner in = new Scanner(System.in);
    public static int menuDepth = 1;

    public static void incrementMenuDepth() {
        menuDepth++;
        System.out.println();
        System.out.println();        
    }

    public static void decrementMenuDepth() {
        menuDepth--;
        System.out.println();
        System.out.println();
    }
    
    public static int integerInput(String variableName) {
        int input = 0;
        boolean validInput = false;
        IOHandler.menuPrint("Enter the " + variableName);
        while(validInput == false) {
            try {
                IOHandler.menuPrint("");
                input = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                IOHandler.menuPrint("Please enter an integer type input");
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
        IOHandler.menuPrint("Enter the " + variableName);
        while(validInput == false) {
            try {
                IOHandler.menuPrint("");
                input = in.nextLong();
                validInput = true;
            } catch (InputMismatchException e) {
                IOHandler.menuPrint("Please enter an integer type input");
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
        IOHandler.menuPrint("Enter the " + variableName);
        while(validInput == false) {
            try {
                IOHandler.menuPrint("");
                input = in.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                IOHandler.menuPrint("Please enter a decimal value");
            }
            finally {
                in.nextLine();
            }
        }
        return input;
    }

    public static String stringInput(String variableName) {
        String input;
        IOHandler.menuPrint("Enter the " + variableName);
        IOHandler.menuPrint("");
        input = in.nextLine();
        return input;
    }

    public static Calendar dateInput() {
        boolean validInput = false;
        IOHandler.menuPrint("Enter the date");
        Calendar date = Calendar.getInstance();
        while(validInput){
            int dd = IOHandler.integerInput("date");
            int mm = IOHandler.integerInput("month");
            int yy = IOHandler.integerInput("year");
            date.setLenient(false);
            date.set(yy, mm - 1, dd);
            try {
                date.getTime();
                validInput = true;
            }
            catch (Exception e) {
                IOHandler.menuPrint("Invalid date");
            }
        }
        return date;
    }

    public static int menuInput(int highestOption) {
        int input = 0;
        boolean validInput = false;
        while(validInput == false) {
            try {
                IOHandler.menuPrint("");
                input = in.nextInt();
                if(input <= 0 || input > highestOption) {
                    IOHandler.menuPrint("Please enter a valid input, enter a number between 1 and " + highestOption + " to choose that option");
                }
                else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                IOHandler.menuPrint("Please enter an integer type input");
            }
            finally {
                in.nextLine();
            }
        }
        return input;
    }

    public static void menuPrint(String message) {
        for(int i = 0; i < menuDepth; i++) {
            System.out.print("\t");
        }
        if(message.equals("") == false) {
            System.out.println(message);
        }
    }
}