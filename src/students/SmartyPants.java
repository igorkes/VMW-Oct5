package students;

public class SmartyPants extends Student {
    private String favoriteSubject;
    
    public SmartyPants(String name, String address, float gpa, String favoriteSubject) {
        super(name, address, gpa);
        this.favoriteSubject = favoriteSubject;
    }    

    @Override
    public String toString() {
        return super.toString()
            + "-- favoriteSubject = " + favoriteSubject + "]";
    }
}
