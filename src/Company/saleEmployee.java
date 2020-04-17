package Company;

public class saleEmployee implements Employee{
    double saleMoney;
    double basicSalary=6000;

    public saleEmployee(double saleMoney) {
        this.saleMoney = saleMoney;
    }

    public void setSaleMoney(double saleMoney) {
        this.saleMoney = saleMoney;
    }

    public double calSalary(){
        if(saleMoney<10000){
            return basicSalary+saleMoney*0.1;
        }
        else if(saleMoney<100000){
            return basicSalary+saleMoney*0.15;
        }
        else return basicSalary+saleMoney*0.18;
    }
}
