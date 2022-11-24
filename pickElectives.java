package projectJava.electives;

public class pickElectives {
    public String specialization;
    public String openElective;
    public String[] programmeElective = new String[8];
    minorSpecialization mS = new minorSpecialization();
    openElectives oE = new openElectives();
    programmeElectives pE = new programmeElectives();

    public void getElectives(int sem) {
        if (sem >= 1 && sem <= 3) {
            System.out.println("No electives for you!");
        } else if (sem == 4){
            System.out.println("You can pick one open elective!");
            oE.courses(sem);
            openElective = oE.openElective;
        } else if (sem == 5 || sem == 6) {
            System.out.println("You can pick one open elective and one programme elective from your minor specialization");
            oE.courses(sem);
            openElective = oE.openElective;
            if (sem == 5) {
                specialization = mS.pickSpecialization();
                pE.courses(sem, specialization);
                programmeElective[1] = pE.pE[1];
            } else {
                specialization = mS.getSpecialization();
                pE.courses(sem, specialization);
                programmeElective[2] = pE.pE[2];
            }
        } else if (sem == 7) {
            System.out.println("You have 2 programme electives from minor specialization and can pick 3 programme electives");
            specialization = mS.getSpecialization();
            pE.courses(sem, specialization);
            programmeElective[3] = pE.pE[3];
            programmeElective[4] = pE.pE[4];
            pE.courses(sem);
            programmeElective[5] = pE.pE[5];
            programmeElective[6] = pE.pE[6];
            programmeElective[7] = pE.pE[7];
        } else {
            System.out.println("Go focus on your project!");
        }
    }
}