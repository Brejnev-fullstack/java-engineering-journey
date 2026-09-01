public class DeveloperProfile {
    String firstName;
    String lastName;
    int age;

    public String fullName(){
        return "Je suis"+ " "+ this.firstName +" "+ this.lastName +" "+ this.age;
    }
}
