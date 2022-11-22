package io.marwin1991.testfactory;

public class Employer {

    private String name;
    private Department department;

    private int perDayInput;
    private int daysOff;

    private boolean retired;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", perDayInput=" + perDayInput +
                ", daysOff=" + daysOff +
                ", retired=" + retired +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getPerDayInput() {
        return perDayInput;
    }

    public void setPerDayInput(int perDayInput) {
        this.perDayInput = perDayInput;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }



    /**
     * Returns employer result which is perDayInput multiplay by (20 - daysOff) if daysOff is 0 plus 5
     */
    public int getResult(int perDayInput) {
       return daysOff==0 ? perDayInput*(20-daysOff)+5 : perDayInput*(20-daysOff);
    }


    public enum Department {
        SALES, HR, FACTORY
    }

}
