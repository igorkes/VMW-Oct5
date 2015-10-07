package strategybanking;

public class MinimumBalanceWithdrawalStrategy implements WithdrawalStrategy {
    private long minimumBalance;

    public MinimumBalanceWithdrawalStrategy(long minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
    @Override
    public boolean approveWithdrawal(long balance, long amount) {
        return balance - amount >= minimumBalance;
    }
}
