package io.marwin1991.testfactory;

public class CompanyUtils {

    /**
     * Returns a character representing given employer (F-Factory, H-hr, S-Sales, .-null, B - Boss)
     * Throws an IllegalArgumentException when given invalid input
     */
    public static char getChar(Employer actor) {
        if (actor instanceof Boss) {
            return 'B';
        }
        if (actor == null) {
            return '.';
        }
        Employer.Department department = actor.getDepartment();
        switch (department) {
            case FACTORY:
                return 'F';
            case HR:
                return 'H';
            case SALES:
                return 'S';

        }
        throw new IllegalArgumentException("Bad data ");
    }



    /**
     * Returns the amount of steps a employer has to make in order to get from pos1 to pos2
     */
    public static int getDistance(Vector pos1, Vector pos2) {
        int posX = pos1.getX() - pos2.getX();
        int posY = pos1.getY() - pos2.getY();
        return Math.abs(posX) + Math.abs(posY);
    }

    public static void main(String[] args) {
//        Vector vector = new Vector(-3, 2);
//        Vector vector1 = new Vector(5, -4);
//        System.out.println(getDistance(vector, vector1));
        Employer employer = new Employer();
        System.out.println(getChar(CompanyFactory.createPlayer(Employer.Department.HR)));


    }
}
