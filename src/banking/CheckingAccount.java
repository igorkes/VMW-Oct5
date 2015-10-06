package banking;

public class CheckingAccount extends Account {
    public static final long FEE = 35;
    
    private long overdraftLimit;
    
    public CheckingAccount(String holder, long initialBalance, long overdraftLimit) {
        super(holder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
   
    @Override
    public long withdraw(long amount) {
        if (getBalance() - amount > overdraftLimit) {
            return super.withdraw("Withdrawal", amount);
        } else {
            super.withdraw("Fee for refused withdrawal", FEE);
            return 0;
        }
    }
    
    @Override
    public long deposit(long amount) {
        return super.deposit("Deposit", amount);
    }
    
    @Override
    public void monthEnd() {
        long balance = getBalance();
        if (balance < 0) {
            long interest = balance / 10; // not realistic!
            super.withdraw("Monthly interest", interest);
        }
    }
}
