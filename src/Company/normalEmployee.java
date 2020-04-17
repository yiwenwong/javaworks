package Company;

public class normalEmployee implements Employee{
    private int hour;
    private double basicSalary=6000;

    public normalEmployee(int hour) {
        this.hour = hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double calSalary(){
        if(hour>196){
            return basicSalary+(hour-196)*200;
        }
        else return basicSalary;
    }
}
