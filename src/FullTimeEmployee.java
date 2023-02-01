//this is child class and extends Employee class
public class FullTimeEmployee extends Employee{
    private double salary;

    FullTimeEmployee(String firstName, String lastName, int age, int id, double salary){
        //super: this keyword gives access to methods and properties of parent class
        super(firstName, lastName, age, id);
        this.salary = salary;
    }

    //this method overrides the monthlySalary in parent class
    public double monthlySalary() {
        return salary;
    }
}
