/*
 * Submitted by:
 * Preet Angad Singh Nanda - 40234930
 * Naman Kumar - 40245246
 */

import java.util.Scanner;

public class Main {
    // making an object array which stores employees as well as bills
    static Object[] recordArr = new Object[20];
    static int count = 0;
    static int count_cheque = 1;

    // function to add employee
    public static void addEmployee() {
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
        char isFulltime;
        while (true) {
            isFulltime = sc.next().charAt(0);
            // check if the employee is full time or part time
            if (Character.toLowerCase(isFulltime) == 'y') {
                System.out.println("Enter salary");
                double salary = sc.nextDouble();
                recordArr[count] = new FullTimeEmployee(firstName, lastName, age, id, salary);
                count++;
                break;
            } else if (Character.toLowerCase(isFulltime) == 'n') {
                System.out.println("Enter echelon");
                int echelon = sc.nextInt();
                System.out.println("Enter hours");
                double hours = sc.nextDouble();
                recordArr[count] = new PartTimeEmployee(firstName, lastName, age, id, echelon, hours);
                count++;
                break;
            } else {
                System.out.println("Invalid input! Enter Y for Yes and N for No\n");
            }
        }
    }

    // function to add Bill
    public static void addBill() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter company name");
        String company = sc.next();

        System.out.println("Enter Bill Amount");
        double billAmount = sc.nextDouble();

        System.out.println("Enter the month");
        String month = sc.next();
        int day;
        while (true) {
            System.out.println("Enter the day");
            day = sc.nextInt();
            if (day >= 1 && day <= 31) {
                break;
            } else {
                System.out.println("Please enter a valid day between 0 to 31");
            }
        }

        System.out.println("Enter the year");

        int year = sc.nextInt();

        recordArr[count] = new Bill(company, billAmount, month, day, year);
        count++;
    }

    // function to display cheque and bill amounts
    public static void issueCheque() {
        for (Object obj : recordArr) {
            if (obj != null) {
                // check if the object belongs to Employee or Bill
                if (obj instanceof Employee) {
                    Employee employee = (Employee) obj;
                    System.out.println("Cheque: #" + count_cheque);
                    System.out.println("Employee ID: " + employee.id);
                    System.out.println("Payable to: " + employee.firstName + " " + employee.lastName);
                    System.out.println("Amount: $ " + employee.pay());
                    System.out.println();
                } else if (obj instanceof Bill) {
                    Bill bill = (Bill) obj;
                    System.out.println("Cheque: #" + count_cheque);
                    System.out.println("Payable to: " + bill.company);
                    System.out.println("Amount: $ " + bill.pay());
                    System.out.println("Due Date: " + bill.dueDate);
                    System.out.println();
                }
                count_cheque++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        // Getting input from user
        while (true) {
            System.out.print("Enter a number between 1 and 4: \n" +
                    "1. Add an employee\n" +
                    "2. Add a bill\n" +
                    "3. Issue cheques\n" +
                    "4. Exit\n");
            input = sc.nextInt();
            if (input >= 1 && input <= 4) {
                switch (input) {
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