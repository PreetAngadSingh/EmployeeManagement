public class Bill {
    String company;
    double billAmount;
    String dueDate;

    Bill(String company, double billAmount, String month, int date,int year){
        this.company = company;
        this.billAmount = billAmount;
        dueDate = date + " " + month + " " + year;
    }
}
