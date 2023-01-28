public class PartTimeEmployee extends Employee{
    int echelon;
    double hourlyRate;
    double hours;

    PartTimeEmployee(String firstName, String lastName, int age, int id, int echelon, double hours){
        super(firstName, lastName, age, id);
        this.echelon = echelon;
        this.hours = hours;
        hourlyRate = assignHourlyRate(echelon);
    }

    double assignHourlyRate(int echelon){
        switch(echelon){
            case 1:
                return 15;
            case 2:
                return 20;
            case 3:
                return 25;
            case 4:
                return 30;
            case 5:
                return 40;
            default:
                return 0;
        }
    }
    public double monthlySalary() {
        return hourlyRate * hours;
    }
}
