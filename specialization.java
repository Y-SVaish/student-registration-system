package projectJava.electives;
import java.util.Scanner;

//an abstract class that has the same name as the program itself
public abstract class specialization {
    abstract String pickSpecialization();
    abstract String getSpecialization();
}

//to get minor specialization
class minorSpecialization extends specialization {
    Scanner scan = new Scanner(System.in);
    String specialization;

    String pickSpecialization() {
        System.out.println("CSE students have the following options: ");
        while(true) {
            System.out.println("1. Cloud Computing");
            System.out.println("2. Cyber Security");
            System.out.println("3. Data Analytics");
            System.out.print("Which one would you like? ");
            int choice = scan.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid number, try again");
                continue;
            } else {
                switch(choice) {
                    case 1:
                        specialization = "Cloud Computing";
                        break;
                    case 2:
                        specialization = "Cyber Security";
                        break;
                    case 3:
                        specialization = "Data Analytics";
                        break;
                }
                System.out.println("Successfully picked course!");
                break;
            }
        }
        return specialization;
    }

    String getSpecialization() {
        while(true) {
            System.out.println("1. Cloud Computing");
            System.out.println("2. Cyber Security");
            System.out.println("3. Data Analytics");
            System.out.print("What's your specialization? ");
            int choice = scan.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid number, try again");
                continue;
            } else {
                switch(choice) {
                    case 1:
                        specialization = "Cloud Computing";
                        break;
                    case 2:
                        specialization = "Cyber Security";
                        break;
                    case 3:
                        specialization = "Data Analytics";
                        break;
                }
                break;
            }
        }
        return specialization;
    }
}