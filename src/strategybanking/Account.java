package strategybanking;

import java.util.ArrayList;
import java.util.List;

public class Account {
    public static final long FEE = -35;

    private String holder;
    private long balance;
    private List<String> transactionLog = new ArrayList<>();
    private WithdrawalStrategy withdrawalStrategy;

    public long getBalance() {
        return balance;
    }

    protected Account(String holder, long initialBalance, WithdrawalStrategy withdrawalStrategy) {
        this.holder = holder;
        balance = initialBalance;
        this.withdrawalStrategy = withdrawalStrategy;
        log("Created: opening funds " + balance);
    }

    public long withdraw(long amount) {
        if (withdrawalStrategy.approveWithdrawal(balance, amount)) {
            transact("Withdrawal", -amount);
            return amount; 
        } else {
            transact("Fee for refused withdrawal", FEE);
            return 0;
        }
    }

    public long deposit(long amount) {
        transact("Deposit", amount);
        return getBalance(); 
    }

    public void monthEnd() {
        log("Month end");
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
