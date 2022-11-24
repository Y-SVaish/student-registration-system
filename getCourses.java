package projectJava.electives;
import java.util.Scanner;

//to get electives for a specific semester
interface getCourses {
    void courses(int sem);
    Scanner scan = new Scanner(System.in);
}

//to get open electives for a specific semester
class openElectives implements getCourses {
    String oE1 = "Advanced Mechanics";
    String oE2 = "Pharmaceutical Engineering";
    String oE3 = "Accounting";
    String oE4 = "Basics of Designing";
    String oE5 = "Basics of Hospitality";
    String oE6 = "Introduction to Law";
    String openElective;

    public void courses(int sem) {
        System.out.println("Available open electives for CSE are:");
        System.out.println("1. "+oE1+"\n2. "+oE2+"\n3. "+oE3+"\n4. "+oE4+"\n5. "+oE5+"\n6. "+oE6);
        System.out.println("What's your choice? ");
        int choice = scan.nextInt();

        while(true) {
            if (choice >=1 && choice <= 6) {
                switch (choice) {
                    case 1:
                        openElective = oE1;
                        break;

                    case 2:
                        openElective = oE2;
                        break;

                    case 3:
                        openElective = oE3;
                        break;

                    case 4:
                        openElective = oE4;
                        break;

                    case 5:
                        openElective = oE5;
                        break;

                    case 6:
                        openElective = oE6;
                        break;
                }
                break;
            } else {
                System.out.println("Invalid choice, try again");
            }
        }
        System.out.println("Registered for "+openElective+" successfully!");
    }
}

//to get program electives for a specific semester
class programmeElectives implements getCourses {
    String[] pE = new String[8];

    public void courses(int sem) {
        int[] option = new int[3];

        for (int i = 5; i <= 7; i++) {
            System.out.println("Available programme electives for CSE are:");
            System.out.println("1. Information Retrieval\n" +
                    "2. Computer Graphics & Multimedia\n" +
                    "3. User Interface Design\n" +
                    "4. Digital Image Processing\n" +
                    "5. Internet of Things\n" +
                    "6. Big Data Analytics\n" +
                    "7. Software Defined Networks\n" +
                    "8. Deep Neural Network\n" +
                    "9. Social Network Analysis\n" +
                    "10. Software Testing\n" +
                    "11. Linux System and Shell Programming\n" +
                    "12. Wireless Sensor & Adhoc Network\n" +
                    "13. Mobile Computing\n" +
                    "14. Natural Language Processing\n" +
                    "15. Computer Vision");
            while(true) {
                System.out.println("What's your choice? ");
                option[i-5] = scan.nextInt();
                int choice = option[i-5];
                if (choice >=1 && choice <= 13) {
                    switch (choice) {
                        case 1:
                            pE[i] = "Information Retrieval";
                            break;

                        case 2:
                            pE[i] = "Computer Graphics & Multimedia";
                            break;

                        case 3:
                            pE[i] = "User Interface Design";
                            break;

                        case 4:
                            pE[i] = "Digital Image Processing";
                            break;

                        case 5:
                            pE[i] = "Internet of Things";
                            break;

                        case 6:
                            pE[i] = "Big Data Analytics";
                            break;

                        case 7:
                            pE[i] = "Software Defined Networks";
                            break;

                        case 8:
                            pE[i] = "Deep Neural Network";
                            break;

                        case 9:
                            pE[i] = "Social Network Analysis";
                            break;

                        case 10:
                            pE[i] = "Software Testing";
                            break;

                        case 11:
                            pE[i] = "Linux System and Shell Programming";
                            break;

                        case 12:
                            pE[i] = "Wireless Sensor & Adhoc Network";
                            break;

                        case 13:
                            pE[i] = "Mobile Computing";
                            break;

                        case 14:
                            pE[i] = "Natural Language Processing";
                            break;

                        case 15:
                            pE[i] = "Computer Vision";
                            break;
                    }
                    System.out.println("Registered for "+pE[i]+" successfully!");
                    break;
                } else {
                    System.out.println("Invalid choice, try again");
                }
            }
        }
    }
    public void courses(int sem, String specialization) {
        if (specialization.equals("Cloud Computing")) {
            new pECloud(sem);
        } else if (specialization.equals("Cyber Security")) {
            new pECyber(sem);
        } else {
            new pEData(sem);
        }
    }
}

//to get specialization-specific program electives

class pECloud extends programmeElectives {
    pECloud(int sem) {
        if (sem == 5) {
            super.pE[1] = "Cloud Computing and Virtualization";
            System.out.println("Registered for "+pE[1]+" successfully!");
        } else if(sem == 6) {
            super.pE[2] = "Cloud Infrastructure Services";
            System.out.println("Registered for "+pE[2]+" successfully!");
        } else {
            super.pE[3] = "Cloud Computing Applications";
            System.out.println("Registered for "+pE[3]+" successfully!");
            super.pE[4] = "Cloud Security and Privacy";
            System.out.println("Registered for "+pE[4]+" successfully!");
        }
    }
}

class pECyber extends programmeElectives {
    pECyber(int sem) {
        if (sem == 5) {
            super.pE[1] = "Information Coding";
            System.out.println("Registered for "+pE[1]+" successfully!");
        } else if(sem == 6) {
            super.pE[2] = "Principles of Secure Programing";
            System.out.println("Registered for "+pE[2]+" successfully!");
        } else {
            super.pE[3] = "Cyber Security";
            System.out.println("Registered for "+pE[3]+" successfully!");
            super.pE[4] = "Digital Forensics & Cyber Crimes";
            System.out.println("Registered for "+pE[4]+" successfully!");
        }
    }
}

class pEData extends programmeElectives {
    pEData(int sem) {
        if (sem == 5) {
            super.pE[1] = "Predictive Analytics";
            System.out.println("Registered for "+pE[1]+" successfully!");
        } else if(sem == 6) {
            super.pE[2] = "Image Processing and Pattern Analysis";
            System.out.println("Registered for "+pE[2]+" successfully!");
        } else {
            super.pE[3] = "Data Visualization Techniques";
            System.out.println("Registered for "+pE[3]+" successfully!");
            super.pE[4] = "Fundamentals of Big Data";
            System.out.println("Registered for "+pE[4]+" successfully!");
        }
    }
}