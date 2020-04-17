package Company;

public class Test {
    public static void main(String [] args){
        Company com=new Company();
        Employee hour_e1=new hourEmployee(200,10);
        Employee hour_e2=new hourEmployee(230,10);
        Employee sale_e1=new saleEmployee(5000);
        Employee sale_e2=new saleEmployee(200000);
        Employee norm_e=new normalEmployee(205);

        com.addCompany(hour_e1);
        com.addCompany(hour_e2);
        com.addCompany(sale_e1);
        com.addCompany(sale_e2);
        com.addCompany(norm_e);
        com.salarySum(com);

        Employee jew_e=new jewelryEmployee(30);
        com.addEmployee(jew_e,com);
        com.salarySum(com);
    }
}
