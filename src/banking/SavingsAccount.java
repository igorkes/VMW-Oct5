package banking;

public class SavingsAccount extends Account {
   public SavingsAccount(String holder, long initialBalance) {
        super(holder, initialBalance);
    }
   
    public long withdraw(long amount) {
        if (getBalance() - amount > 100) {
            transact("Withdrawal", -amount);
            return amount; 
        } else {
            transact("Declined withdrawal ", 0);
            return 0;
        }
    }
    
    @Override
    public long deposit(long amount) {
        transact("Deposit" , amount);
        return getBalance();
    }
    
    @Override
    public void monthEnd() {
        transact("Interest payment", getBalance() / 10);
    }
}
