package projectJava;
import java.util.Scanner;

public class Implement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] S;
        int studentsNum = 100;

        //asking number of students from user
        System.out.print("Number of students enrolling: ");
        studentsNum = scan.nextInt();
        S = new Student[studentsNum];

        try {
            for (int i = 0; i < studentsNum; i++) {
                S[i] = new Student();
                S[i].courseEnroll();
                S[i].display();
            }
        } catch (ArrayIndexOutOfBoundsException A) {
            System.out.println("Unable to initialize at present, please try later");
        }

        finally {
            System.out.println("Hope you have a great day!");
            return;
        }
    }
}