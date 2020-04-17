package Company;

public class hourEmployee implements Employee {
    private int hours;
    private double hourSalary;

    public hourEmployee(int hours,double hourSalary) {
        this.hours = hours;
        this.hourSalary=hourSalary;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public double calSalary(){
        return hours*hourSalary;
    }
}
