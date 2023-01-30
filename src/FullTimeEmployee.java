public class FullTimeEmployee extends Employee{
    private double salary;

    FullTimeEmployee(String firstName, String lastName, int age, int id, double salary){
        //super: this keyword gives access to methods and properties of parent class
        super(firstName, lastName, age, id);
        this.salary = salary;
    }

    public double monthlySalary() {
        return salary;
    }
}
