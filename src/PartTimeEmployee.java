public class PartTimeEmployee extends Employee {
    int echelon;
    double hourlyRate;
    double hours;
    int[] echelonArr = { 15, 20, 25, 30, 40 };

    PartTimeEmployee(String firstName, String lastName, int age, int id, int echelon, double hours) {
        super(firstName, lastName, age, id);
        this.echelon = echelon;
        this.hours = hours;
        hourlyRate = assignHourlyRate(echelon);
    }

    double assignHourlyRate(int echelon) {
        if (echelon < 6)
            return echelonArr[echelon - 1];
        else
            return 0;
    }

    public double monthlySalary() {
        return hourlyRate * hours;
    }
}
