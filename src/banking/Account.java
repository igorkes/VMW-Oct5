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
       throw new RuntimeException("Should never be called!");
    }
    
    public long deposit(long amount) {
       throw new RuntimeException("Should never be called!");
    }
    
    public void monthEnd() {
        log("RAW month end");
    }
    
    protected final void transact(String transactionType, long amount) {
        balance += amount;
        log(transactionType + " of: " + amount + " new balance: " + balance);
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
