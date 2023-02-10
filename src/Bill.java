//this is Bill class
public class Bill implements payable {
    String company;
    double billAmount;
    String dueDate;

    Bill(String company, double billAmount, String month, int date, int year) {
        this.company = company;
        this.billAmount = billAmount;
        dueDate = date + " " + month + " " + year; // converting date month and year into a String
    }

    public double pay() {
        return billAmount;
    }
}
