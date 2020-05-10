import java.util.ArrayList;

public abstract class Employee {
    private String name;
    private int id;
    private String address;
    private String bankName;
    private String accountNumber;
    private boolean unionMember;
    private ArrayList<Transaction> unionDues;
    private PaymentMethod paymentMethod;
    protected final int editablesLength = 4;

    Employee() {
        IOHandler.menuPrint("Please enter the following details to add a new employee");
        this.name = IOHandler.stringInput("name of the employee");
        this.address = IOHandler.stringInput("address of the employee");
        this.accountNumber = IOHandler.stringInput("bank account number");
        this.bankName = IOHandler.stringInput("bank name");
        // To be completed
        IOHandler.menuPrint("The employee ID is " + this.id);
    }

    Employee(Employee employee) {
        this.equals(employee);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isUnionMember() {
        return this.unionMember;
    }

    public void setUnionMember(boolean unionMember) {
        this.unionMember = unionMember;
    }

    public ArrayList<Transaction> getUnionDues() {
        return this.unionDues;
    }

    public void setUnionDues(ArrayList<Transaction> unionDues) {
        this.unionDues = unionDues;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void AddUnionDues(Transaction transaction) {
        this.unionDues.add(transaction);
    }

    // public void printEditables() {
    //     IOHandler.menuPrint("1. To edit employee's name");
    //     IOHandler.menuPrint("2. To edit employee's address");
    //     IOHandler.menuPrint("3. To edit employee's bank name");
    //     IOHandler.menuPrint("4. To edit employee's accountNumber");
    //     // IOHandler.menuPrint(". To edit employee's");
    //     // IOHandler.menuPrint(". To edit employee's");
    //     // IOHandler.menuPrint(". To edit employee's");
    //     // IOHandler.menuPrint(". To edit employee's");
    //     // IOHandler.menuPrint(". To edit employee's");
    // }

    // public abstract int takeEditOption();

    // public void EditChoice(int choice) {
    //     switch(choice) {
    //         case 1: {
    //             this.setName(IOHandler.stringInput("employee's name"));
    //             break;
    //         }
    //         case 2: {
    //             this.setAddress(IOHandler.stringInput("employee's address"));
    //             break;
    //         }
    //         case 3: {
    //             this.setBankName(IOHandler.stringInput("employee's bank name"));
    //             break;
    //         }
    //         case 4: {
    //             this.setAccountNumber(IOHandler.stringInput("employee's account number"));
    //             break;
    //         }
    //     }
    // }

    // public void Editdetails() {

    // }
}