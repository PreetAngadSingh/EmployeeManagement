public class FullTimeEmployee extends Employee{
    private double salary;

    FullTimeEmployee(String firstName, String lastName, int age, int id, double salary){
        super(firstName, lastName, age, id);
        this.salary = salary;
    }

    public double monthlySalary() {
        return salary;
    }
}
