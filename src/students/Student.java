package students;

public class Student {

    private String name;
    private String address;
    private float gpa;

    public Student(String name, float gpa) {
        isValid(name, gpa);
        this.name = name;
        this.gpa = gpa;
    }

    public Student(String name, String address, float gpa) {
        this(name, gpa);
        this.address = this.address;
    }

//    Cannot have two constructors with same _type_ list (names don't differentiate0
//    public Student(String father, String mother, float wealth) {
//    }
    public String embelishName(String s) {
        return "Mx. " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        isValid(name, this.gpa);
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getAddress() {
        return this.address;
    }
    
//    private String banana = "banana";
//
//    public String getBanana() {
//        String banana = "blah!";
//        return banana;
//    }
//
    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return "Info: " + this.getName() + " has gpa " + gpa;
    }

    public String getInfo(String prefix) {
        return prefix + this.getName() + " has gpa " + gpa;
    }

    
    private void isValid(String name, float gpa) {
        if (!(name != null
            && name.length() > 0
            && gpa > 0
            && gpa <= 4)) {
            throw new RuntimeException("Bad student!");
        }
    }
    
    public String toString() {
        return "Student [ name = " + this.name
            + ", address = " + this.address
            + ", gpa = " + this.gpa + "]";
    }
}
