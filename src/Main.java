import java.util.Scanner;

public class Main {
    static Object[] arr = new Object[20];
    static int count=0;
    static int count_cheque = 1;
    public static void addEmployee(){
        System.out.println("Please enter details of Employee");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name");
        String firstName = sc.next();

        System.out.println("Enter Last Name");
        String lastName = sc.next();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter id");
        int id = sc.nextInt();

        System.out.println("Is the employee full time? (Y/N)");
        char full;
        while (true) {
            full = sc.next().charAt(0);
            if (Character.toLowerCase(full)=='y') {
                System.out.println("Enter salary");
                double salary = sc.nextDouble();
                arr[count] = new FullTimeEmployee(firstName, lastName, age, id, salary);
                count++;
                break;
            } else if(Character.toLowerCase(full)=='n'){
                System.out.println("Enter echelon");
                int echelon = sc.nextInt();
                System.out.println("Enter hours");
                double hours = sc.nextDouble();
                arr[count] = new PartTimeEmployee(firstName, lastName, age, id, echelon, hours);
                count++;
                break;
            }
                else {
                System.out.println("Invalid input! Enter Y for Yes and N for No\n");
            }
        }
    }
    public static void addBill(){
        System.out.println("Inside addBill");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter company name");
        String company = sc.next();

        System.out.println("Enter Bill Amount");
        double billAmount = sc.nextDouble();

        System.out.println("Enter the month");
        String month = sc.next();

        System.out.println("Enter the date");
        int date = sc.nextInt();

        System.out.println("Enter the month");
        int year = sc.nextInt();
        
        arr[count] = new Bill(company, billAmount, month, date, year);
        count++;
    }
    public static void issueCheque() {
        System.out.println("Inside issueCheque");
        for (Object obj : arr) {
            if (obj != null) {
                if (obj instanceof Employee) {
                    Employee employee = (Employee) obj;
                    System.out.println("Cheque :" + count_cheque);
                    System.out.println("Employee ID :" + employee.id);
                    System.out.println("Payable to: " + employee.firstName + " " + employee.lastName);
                    System.out.println("Amount: $" + employee.monthlySalary());
                    System.out.println();
                } else if (obj instanceof Bill) {
                    Bill bill = (Bill) obj;
                    System.out.println("Cheque #" + count_cheque);
                    System.out.println("Payable to: " + bill.company);
                    System.out.println("Amount: $" + bill.billAmount);
                    System.out.println("Due Date: $" + bill.dueDate);
                    System.out.println();
                }
                count_cheque++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Enter a number between 1 and 4: \n" +
                    "1. Add an employee\n" +
                    "2. Add a bill\n" +
                    "3. Issue cheques\n" +
                    "4. Exit\n");
            input = sc.nextInt();
            if (input >= 1 && input <= 4) {
                switch (input){
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        addBill();
                        break;
                    case 3:
                        issueCheque();
                        break;
                    case 4:
                        System.exit(0);
                }
            } else {
                System.out.println("Invalid input!");
            }
        }



    }
}