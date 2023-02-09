//this is Employee parent Class
public class Employee implements payable {
    String firstName;
    String lastName;
    int age;
    int id;

    public Employee(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public double pay() {
        return 0;
    }
}
