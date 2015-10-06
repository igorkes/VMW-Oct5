package vmwoct5;

import java.util.Date;

public class VarArgs {
    public static void showStrings(String ... theStrings) {
        for (int i = 0; i < theStrings.length; i++) {
            System.out.println(theStrings[i]);
        }
    }
    
    public static void main(String ... args) {
        showStrings("Fred", "Jim", "Sheila");
        
        System.out.printf("on %3$tm %3$te,%3$tY, %2$s had a temperature of %1$f\n", 99.95F, "Fred", new Date());
    }
}
