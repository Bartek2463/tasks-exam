package io.marwin1991.testfactory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Static class with extension methods for reports about employer' performance during the work
 */
public class CompanyResultBoard {


    /**
     * Returns a collection of all employers, sorted by their result (from highest to lowest)
     */
    public static List<Employer> getRankedEmployer(List<Employer> employers) {

        return employers.stream()
                .sorted(Comparator.comparing(Employer::getResult).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Returns a collection of all employers, from given department, sorted by their score (from highest to lowest)
     */
    public static List<Employer> getRankedEmployerInDepartment(List<Employer> employers, Employer.Department department) {

        return employers.stream()
                .filter(employer -> employer.equals(department))
                .sorted(Comparator.comparing(Employer::getResult).reversed())
                .collect(Collectors.toList());

    }

    /**
     * Returns the department that has the greatest result scored by its employers
     */
    public static Employer.Department getBestDepartment(List<Employer> employers) {

        Employer employer = employers.stream()
                .max(Comparator.comparing(Employer::getResult)).get();
        return employer.getDepartment();
    }


    /**
     * Returns amount of retired employers
     */
    public static int getRetiredEmployers(List<Employer> employers) {
      return(int) employers.stream()
                .filter(employer -> employer.isRetired()==true)
                .count();
    }

    /**
     * Returns full result board string for list (see the example)
     */
    public static String getResultBoard(List<Employer> players) {
        // Department SALSE Adam Result: 20
        // Department HR Eve Points: 10
        // Department FACTORY Abel Points: 5 RETIRED

        throw new RuntimeException("Not impl");
    }

    public static void main(String[] args) {

    }

}
