package students;

public class Student {

    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        isValid(name, gpa);
        this.name = name;
        this.gpa = gpa;
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

    private void isValid(String name, float gpa) {
        if (!(name != null
            && name.length() > 0
            && gpa > 0
            && gpa <= 4))
            throw new RuntimeException("Bad student!");
    }
}
