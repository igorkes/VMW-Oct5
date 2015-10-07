package strategybanking;

public interface WithdrawalStrategy {
    /* public abstract */ boolean approveWithdrawal(long balance, long amount);
}
