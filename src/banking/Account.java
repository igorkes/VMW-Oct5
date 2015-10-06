package banking;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String holder;
    private long balance;
    private List<String> transactionLog = new ArrayList<>();
    
    public long getBalance() {
        return balance;
    }
    
    protected Account(String holder, long initialBalance) {
        this.holder = holder;
        balance = initialBalance;
        log("Created: opening funds " + balance);
    }
    
    public long withdraw(long amount) {
        return withdraw("RAW Withdrawal", amount);
    }
    
    public long deposit(long amount) {
        return deposit("RAW deposit", amount);
    }
    
    public void monthEnd() {
        log("RAW month end");
    }
    
    protected long withdraw(String transactionType, long amount) {
        balance -= amount;
        log(transactionType + " debit of: " + amount + " new balance: " + balance);
        return amount;
    }
    
    protected long deposit(String transactionType, long amount) {
        balance += amount;
        log(transactionType + " credit of: " + amount + " new balance: " + balance);
        return balance;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() 
            + " Holder: " + holder
            + " balance = " + balance
            + " Transactions: " + transactionLog;
    }
    
    protected void log(String transactionDescription) {
        transactionLog.add(transactionDescription);
    }
}
