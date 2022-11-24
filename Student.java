package projectJava;
import java.util.InputMismatchException;
import java.util.Scanner;
import projectJava.electives.pickElectives;

public class Student {
    String firstName;
    String lastName;
    int sem;
    int regNum, count = 0;
    String[] courses = new String[7];
    private double balance = 0;
    static double courseCost = 300000.0;

    Scanner scan = new Scanner(System.in);

    //Prompt user to give name and semester of student
    Student() {
        System.out.print("Enter name of student: ");
        firstName = scan.next();
        lastName = scan.next();

        try {
            System.out.print("Enter registration number: ");
            regNum = scan.nextInt();

            while (true) {
                System.out.print("Enter current semester (1-8): ");
                sem = scan.nextInt();

                //check validity of semester
                if (sem >= 1 && sem <= 8) {
                    break;
                } else {
                    System.out.println("Invalid semester, try again");
                }
            }
        } catch(InputMismatchException exception) {
            System.out.println("Error, only numerical value allowed");
        }
        count++;
        System.out.println("Initialization complete");
    }

    //Prompt user to give preferred electives
    public void courseEnroll() {
        pickElectives pE = new pickElectives();
        pE.getElectives(sem);

        if (sem >=4 && sem <=6) {
            courses[0] = pE.openElective;
        }
        if (sem == 5) {
            courses[1] = pE.programmeElective[1];
        } else if (sem == 6) {
            courses[1] = pE.programmeElective[2];
        } else if (sem == 7) {
            courses[1] = pE.programmeElective[3];
            courses[2] = pE.programmeElective[4];
            courses[3] = pE.programmeElective[5];
            courses[4] = pE.programmeElective[6];
            courses[5] = pE.programmeElective[7];
        }
        System.out.print("Proceed to payment? ");
        String response = scan.next();

        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            System.out.println("Add balance of Rs."+courseCost);
            balance = scan.nextDouble();
            if (balance>courseCost) {
                throw new ArithmeticException("Insufficient Funds");
            }
            System.out.println(payment(balance));
        } else {
            throw new NullPointerException("Cannot complete registration without payment");
        }
    }

    private boolean payment(double balance) {
        balance = balance - courseCost;
        if (balance < this.balance) {
            this.balance = balance;
            return true;
        } else {
            return false;
        }
    }

    //Prints data and electives
    public void display() {
        System.out.println(firstName + " " + lastName);
        System.out.println(regNum);
        System.out.println(sem + " semester");
        System.out.println("Subjects:");

        if (sem >=4 && sem <=6) {
            System.out.println(courses[0]);
        }
        if (sem == 5 || sem == 6) {
            System.out.println(courses[1]);
        } else if (sem == 7) {
            for (int i = 1; i<=5; i++) {
                System.out.println(courses[i]);
            }
        }
    }
}