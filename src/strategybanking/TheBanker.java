package strategybanking;

import java.util.ArrayList;
import java.util.List;

public class TheBanker {
    public static void showAccounts(List<Account> la) {
        for (Account a : la) {
            System.out.println("> " + a);
            System.out.println("======================\n");
        }
    }
    
    public static void doMonthEnd(List<Account> la) {
        for (Account a : la) {
            a.monthEnd();
        }
    }
    
    public static void main(String [] args) {
        System.out.println("Creating The Bank!");
        List<Account> accounts = new ArrayList<>();
        Account ac1 = new Account("Fred", 2000, new MinimumBalanceWithdrawalStrategy(-1000));
        Account ac2 = new Account("Jim", 100, new LimitedWithdrawalStrategy());
        Account ac3 = new Account("Sheila", 10000, new MinimumBalanceWithdrawalStrategy(100));
        accounts.add(ac1);
        accounts.add(ac2);
        accounts.add(ac3);
        
        ac1.deposit(100);
        ac1.withdraw(2400);
        doMonthEnd(accounts);
        ac1.withdraw(2000);
        ac1.deposit(12000);
        ac2.withdraw(1000);
        doMonthEnd(accounts);
        ac2.deposit(1000);
        ac2.withdraw(10);
        ac2.withdraw(10);
        ac2.withdraw(10);
        ac3.withdraw(6000);
        ac3.deposit(12000);
        doMonthEnd(accounts);
        
        showAccounts(accounts);
    }
}

































