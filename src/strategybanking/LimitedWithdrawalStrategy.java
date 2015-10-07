package strategybanking;

public class LimitedWithdrawalStrategy implements WithdrawalStrategy {

    private int countOfWithdrawals = 0;

    @Override
    public boolean approveWithdrawal(long balance, long amount) {
        if (++countOfWithdrawals > 3) {
            return false;
        }
        return true;
    }

}
