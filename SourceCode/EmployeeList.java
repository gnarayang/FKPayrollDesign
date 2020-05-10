import java.util.ArrayList;
import java.util.Random;

public class EmployeeList<T extends Employee> {
    public ArrayList<T> records;
    public Random random = new Random();
    public boolean[] generatedID = new boolean[100000];

    public void addEmployee(T employee) {
        employee.setId(generateID());
        records.add(employee);
    }

    public void deleteEmployee(T employee) {
        records.remove(employee);
    }

    public T searchEmployeeByName(String name) {
        for(T employee : records) {
            if(name.equals(employee.getName()))
            {
                return employee;
            }
        }
        return null;
    }

    public T searchEmployeeById(int id) {
        if(generatedID[id] == false)
        {
            return null;
        }
        for(T employee : records) {
            if(id == employee.getId())
            {
                return employee;
            }
        }
        return null;
    }

    public T search() {
        IOHandler.menuPrint("1. To search employee by id");
        IOHandler.menuPrint("2. To search employee by name");
        T employee = null;
        int searchOption = IOHandler.menuInput(2);
        IOHandler.incrementMenuDepth();
        switch(searchOption) {
            case 1 : {
                int id = IOHandler.integerInput("employee id");
                employee = searchEmployeeById(id);
            }
            case 2 : {
                String name = IOHandler.stringInput("employee name");
                employee = searchEmployeeByName(name);
            }
        }
        IOHandler.decrementMenuDepth();
        return employee;
    }


    public int generateID() {
        int id = random.nextInt(100000);
        while(generatedID[id] == true) {
            id = random.nextInt(100000);
        }
        generatedID[id] = true;
        return id;
    }
}