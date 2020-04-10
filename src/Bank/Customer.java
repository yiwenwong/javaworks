package Bank;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l) {
        this.firstName = f;
        this.lastName=l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Customer " +
                "['" + firstName + ',' +
                 lastName + '] has a account: ' +
                "id is " + account.getId() +
                ", annualInterestRate is " + account.getAnnualInterestRate() +
                "%, balance is " + account.getBalance();
    }
}
