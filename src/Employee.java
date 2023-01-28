public class Employee implements salaryInterface{
    String firstName;
    String lastName;
    int age;
    int id;

    public Employee(String firstName, String lastName, int age, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }
    public double monthlySalary() {
        return 0;
    }
}
