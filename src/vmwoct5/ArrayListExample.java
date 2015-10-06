package vmwoct5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BackwardStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
    
}

public class ArrayListExample {
    
    public static void showAList(List ll) {
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("> " + ll.get(i));
        }
    }
    
    public static void main(String [] args) {
//        ArrayList al = new ArrayList();
        List<String> al = new ArrayList<>();
        al.add("Banana");
        al.add("Split");
        al.add("William");
        al.add("Algernon");
        al.add("Samantha");
        al.add("Bernie");
        al.add("Freddy");
//        al.add(new Date());
        System.out.println("size of al is " + al.size());
        System.out.println("al: " + al);
        System.out.println("al.get(1) is " + al.get(1));
        
        System.out.println("-----------------------------");
        showAList(al);
//        
//        String s = al.get(0);
//        System.out.println("s is " + s);
//
//        s = (String)(al.get(2));
//        System.out.println("s is " + s);

        System.out.println("-----------------------------");
        
        Collections.sort(al);
        showAList(al);

        System.out.println("-----------------------------");
        Comparator<String> bsc = new BackwardStringComparator();
        al.sort(bsc);
        showAList(al);
    }
}
