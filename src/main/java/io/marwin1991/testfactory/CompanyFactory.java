package io.marwin1991.testfactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Static class for creating new employers instances
 */
public  class CompanyFactory {

    /**
     * A predefined collection of names for the employers
     */

    private static final Queue<String> names = new LinkedList<>(Arrays.asList(
            "Marcel", "Moises", "Zane", "Dashawn", "Sean", "Rashad", "Seth", "Oliver", "Chris", "Quinton",
            "August", "Yusuf", "Jeramiah", "Bryce", "Rory", "Preston", "Eli", "Elisha", "Vicente", "Cristian",
            "Justice", "Eddie", "Allan", "Aarav", "Layne", "Owen", "Julio", "Soren", "Levi", "Mekhi", "Paul",
            "Griffin", "Agustin", "Johan", "Jaydin", "Skylar", "Rodrigo", "Brian", "John", "Davon", "Damari",
            "Ty", "Raymond", "Ronald", "Noah", "Abdiel", "Tyree", "Trent", "Rafael", "Jamarion"));


    /**
     * Use this method for getting names
     *
     * @return name
     */

    public static String getName() {
        return names.peek();
    }

    /**
     * Returns a new player instance, depending on given team
     *
     */
    public static Employer createPlayer(Employer.Department department) {

        Employer employer = new Employer();
        employer.setDepartment(department);
        employer.setName(getName());
        System.out.println(employer);
        return employer;
    }

    public static void main(String[] args) {
        createPlayer(Employer.Department.SALES).toString();
        createPlayer(Employer.Department.HR).toString();
        createPlayer(Employer.Department.FACTORY).toString();
    }


    /**
     * Returns an Employer instance, depending on given character
     */
    public static Employer createFromChar(char c) {

        switch (c){
            case 'F':
               return createPlayer(Employer.Department.FACTORY);
            case 'H':
                return createPlayer(Employer.Department.HR);
            case 'S':
                return createPlayer(Employer.Department.SALES);
            default:
                throw new IllegalArgumentException();
        }
    }
}
