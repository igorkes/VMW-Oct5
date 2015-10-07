package banking;

public class CheckingAccount extends Account {
    public static final long FEE = -35;
    
    private long overdraftLimit;
    
    public CheckingAccount(String holder, long initialBalance, long overdraftLimit) {
        super(holder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
   
    @Override
    public long withdraw(long amount) {
        if (getBalance() - amount > overdraftLimit) {
            transact("Withdrawal", -amount);
            return amount; 
        } else {
            transact("Fee for refused withdrawal", FEE);
            return 0;
        }
    }
    
    @Override
    public long deposit(long amount) {
        transact("Deposit", amount);
        return getBalance(); 
    }
    
    @Override
    public void monthEnd() {
        long balance = getBalance();
        if (balance < 0) {
            long interest = balance / 10; // not realistic!
            transact("Monthly interest", interest);
        }
    }
}
