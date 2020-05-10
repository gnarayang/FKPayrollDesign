import java.util.ArrayList;

public class MonthlyEmployee extends Employee{
    private long salary;
    private ArrayList<Transaction> sales;

    public final long comissionPercentage = 15;

    MonthlyEmployee() {
        super();
        this.salary = IOHandler.longInput("salary of the employee");
    }

    MonthlyEmployee(MonthlyEmployee employee) {
        super(employee);
    }

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public ArrayList<Transaction> getSales() {
        return this.sales;
    }

    public void setSales(ArrayList<Transaction> sales) {
        this.sales = sales;
    }

    public void addSales(Transaction sale) {
        sales.add(sale);
    }

    public void addSales() {
        Transaction sale = new Transaction();
        sales.add(sale); 
    }

    // public void printEditables() {
    //     super.printEditables();
    //     IOHandler.menuPrint((super.editablesLength+1) + ". To edit employee's salary");
    // }

    // public int takeEditOption() {
    //     return IOHandler.menuInput(super.editablesLength+1);
    // }

    // public void EditChoice(int choice) {
    //     choice = takeEditOption();
    //     super.EditChoice(choice);
    //     switch(choice) {
    //         case (super.editablesLength+1) : {
    //             break;
    //         }
    //     } 
    // }
}