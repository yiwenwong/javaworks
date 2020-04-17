package Company;

public class jewelryEmployee implements Employee {
    private int jewAmount;

    public jewelryEmployee(int jewAmount) {
        this.jewAmount = jewAmount;
    }

    public void setJewAmount(int jewAmount) {
        this.jewAmount = jewAmount;
    }

    public double calSalary(){
        return jewAmount*50;
    }
}
