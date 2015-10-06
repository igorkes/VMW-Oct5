package students;

import java.util.List;
import java.util.ArrayList;

public class School {
    public static void main(String [] args) {
        List<Student> theClass = new ArrayList<>();
        Student s = new Student("Fred", 3.2F);
//        s.name = null;
//        s.gpa = 3.2F;
        theClass.add(s);
        theClass.add(new Student("Jim", 2.8F));
        
//        new Student();
        Student s1 = theClass.get(1);
        System.out.println("Student " + s1.getName() + " has gpa " + s1.getGpa());
        theClass.add(new Student("Sheila", "Over the Rainbow", 3.9F));
        
        System.out.println("Student s1 is " + s1);
    }
}
