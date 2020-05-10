import java.util.Calendar;

public class Transaction {
    private Calendar date;
    private long amount;
    private String title; 

    Transaction() {
        this.date = IOHandler.dateInput("")
        this.amount = IOHandler.longInput("amount");
        this.title = IOHandler.stringInput("date");
    }
    
    public Calendar getDate() {
        return this.date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}