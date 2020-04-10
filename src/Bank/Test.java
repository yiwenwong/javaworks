package Bank;

public class Test {
    public static void main(String [] args){
        Customer jane=new Customer("Jane","Smith");
        jane.setAccount(new Account(1000,2000,1.23));
        jane.getAccount().deposit(100);
        jane.getAccount().withdraw(960);
        jane.getAccount().withdraw(2000);
        jane.toString();
    }
}
