import java.util.Date;

public class PayrollApplication {
    Date currentDate;
    public static EmployeeList<MonthlyEmployee> monthlyEmployeeList = new EmployeeList<>();
    public static EmployeeList<HourlyEmployee> hourlyEmployeeList = new EmployeeList<>();

    public static void addEmployee() {
        IOHandler.menuPrint("1. To add an employee paid by the month");
        IOHandler.menuPrint("2. To add an employee paid by the hour");
        int employeeType = IOHandler.menuInput(2);
        IOHandler.incrementMenuDepth();
        switch(employeeType)
        {
            case 1 : {
                MonthlyEmployee monthlyEmployee = new MonthlyEmployee();
                monthlyEmployeeList.addEmployee(monthlyEmployee);
                break;
            }
            case 2 : {
                HourlyEmployee hourlyEmployee = new HourlyEmployee();
                hourlyEmployeeList.addEmployee(hourlyEmployee);
                break;
            }
        }
        IOHandler.decrementMenuDepth();
        IOHandler.menuPrint("Employee succesfully created");
    }

    public static void deleteEmployee() {
        IOHandler.menuPrint("1. To add an employee paid by the month");
        IOHandler.menuPrint("2. To add an employee paid by the hour");
        int employeeType = IOHandler.menuInput(2);
        IOHandler.incrementMenuDepth();
        switch(employeeType)
        {
            case 1 : {
                MonthlyEmployee monthlyEmployee = monthlyEmployeeList.search();
                if(monthlyEmployee != null) {
                    monthlyEmployeeList.deleteEmployee(monthlyEmployee);
                }
                else {
                    IOHandler.menuPrint("The employee does not exist");
                }
                break;
            }
            case 2 : {
                HourlyEmployee hourlyEmployee = hourlyEmployeeList.search();
                if(hourlyEmployee != null) {
                    hourlyEmployeeList.deleteEmployee(hourlyEmployee);
                }
                else {
                    IOHandler.menuPrint("The employee does not exist");
                }                
                break;
            }
        }
        IOHandler.decrementMenuDepth();
        IOHandler.menuPrint("Employee succesfully created");
    }

    public static void addTimeCard() {
        HourlyEmployee hourlyEmployee = hourlyEmployeeList.search();
        IOHandler.incrementMenuDepth();
        if(hourlyEmployee == null) {
            System.out.println("The entered employee does not exist");
        }
        else {
            hourlyEmployee.addHours();
        }
        IOHandler.decrementMenuDepth();
    }

    public static void addSalesReceipt() {
        MonthlyEmployee monthlyEmployee = monthlyEmployeeList.search();
        IOHandler.incrementMenuDepth();
        if(monthlyEmployee == null) {
            System.out.println("The entered employee does not exist");
        }
        else {
            monthlyEmployee.addSales();
        }
        IOHandler.decrementMenuDepth();
    }

    // public static void editEmployeeDetails() {
    //     IOHandler.menuPrint("1. To add an employee paid by the month");
    //     IOHandler.menuPrint("2. To add an employee paid by the hour");
    //     int employeeType = IOHandler.menuInput(2);
    //     IOHandler.incrementMenuDepth();
    //     switch(employeeType)
    //     {
    //         case 1 : {
    //             MonthlyEmployee monthlyEmployee = new MonthlyEmployee();
    //             monthlyEmployee.editDetails();
    //             break;
    //         }
    //         case 2 : {
    //             HourlyEmployee hourlyEmployee = new HourlyEmployee();
    //             MonthlyEmployee.editDetails();
    //             break;
    //         }
    //     }
    //     IOHandler.decrementMenuDepth();

    // }


    public static void main(String args[]) {
        IOHandler.menuPrint("Welcome to the Payroll Application");
        IOHandler.menuPrint("This is a terminal based application");
        IOHandler.menuPrint("Enter the option number to choose the option");
        IOHandler.incrementMenuDepth();
            
            IOHandler.menuPrint("1. To add a new employee");
            IOHandler.menuPrint("2. To delete an employee");
            IOHandler.menuPrint("3. Add time card for an hourly salaried employee");
            IOHandler.menuPrint("4. Add sales receipt");
            IOHandler.menuPrint("5. Edit employee details");
            IOHandler.menuPrint("6. Finish tasks for the day");

            int mainMenuOption = IOHandler.menuInput(6);
            IOHandler.incrementMenuDepth();
            while(mainMenuOption != 6) {
                switch(mainMenuOption) {
                    case 1: {
                        addEmployee();
                        break;
                    }
                    case 2: {
                        deleteEmployee();
                        break;
                    }
                    case 3: {
                        addTimeCard();
                        break;
                    }
                    case 4: {
                        addSalesReceipt();
                        break;
                    }
                    case 5: {
                        // editEmployeeDetails();
                    }
                }
            }
            IOHandler.decrementMenuDepth();
        IOHandler.decrementMenuDepth();
    }
}