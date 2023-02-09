//this is child class and extends Employee class
public class PartTimeEmployee extends Employee {
    int echelon;
    double hourlyRate;
    double hours;
    int[] echelonArr = { 15, 20, 25, 30, 40 };

    PartTimeEmployee(String firstName, String lastName, int age, int id, int echelon, double hours) {
        // super: this keyword gives access to methods and properties of parent class
        super(firstName, lastName, age, id);
        this.echelon = echelon;
        this.hours = hours;
        hourlyRate = assignHourlyRate(echelon);
    }

    // this method assigns the hourly rate as per the echelon
    double assignHourlyRate(int echelon) {
        if (echelon < 6)
            return echelonArr[echelon - 1];
        else
            return 0;
    }

    // this method overrides the monthlySalary in parent class
    public double pay() {
        return hourlyRate * hours;
    }
}
