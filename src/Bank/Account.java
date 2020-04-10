package Bank;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id,double balance,double annualInterestRate) {
        this.id = id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double withdraw(double money){
        if(money<=balance) {
            balance = balance - money;
            System.out.format("成功取出:%lf,",money);
        }
        else
            System.out.println("余额不足,取款失败");
    }

    public double deposit(double money){
        balance=balance+money;
        System.out.format("成功存入:%lf,",money);
    }
}
