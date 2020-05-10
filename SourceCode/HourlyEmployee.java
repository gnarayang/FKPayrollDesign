import java.util.ArrayList;

public class HourlyEmployee extends Employee {
    private ArrayList<Long> hours;
    private long perHour;

    HourlyEmployee() {
        super();
    }

    HourlyEmployee(HourlyEmployee employee) {
        super(employee);
    }

    public ArrayList<Long> getHours() {
        return this.hours;
    }

    public void setHours(ArrayList<Long> hours) {
        this.hours = hours;
    }

    public long getPerHour() {
        return this.perHour;
    }

    public void setPerHour(long perHour) {
        this.perHour = perHour;
    }

    public void addHours() {
        long hour = 0;
        do {
            hour = IOHandler.longInput("number of hours");
        } while(hour <=0 || hour > 24) ;
        hours.add(hour);
    }

    public void addHours(long hour) {
        hours.add(hour);
    }
}