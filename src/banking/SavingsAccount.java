package banking;

public class SavingsAccount extends Account {
   public SavingsAccount(String holder, long initialBalance) {
        super(holder, initialBalance);
    }
   
    public long withdraw(long amount) {
        if (getBalance() - amount > 100) {
            return super.withdraw("Withdrawal", amount);
        } else {
            super.withdraw("Declined withdrawal ", 0);
            return 0;
        }
    }
    
    @Override
    public long deposit(long amount) {
        return super.deposit("Deposit" , amount);
    }
    
    @Override
    public void monthEnd() {
        super.deposit("Interest payment", getBalance() / 10);
    }
}
