package Company;

public class Company {
    private Employee [] employee;
    static int j=0;


    public  void  addCompany(Employee  emp ){
        employee[j]=emp;
        j++;
    }

    public Company addEmployee(Employee emp,Company com){
        Employee[] new_company = new Employee[com.employee.length+1];
        for(int i=0;i<new_company.length;i++){
            new_company[i] = com.employee[i];
        }
        new_company[com.employee.length]=emp;
        Company newcom=new Company();
        newcom.employee=new_company);
        return newcom;
    }

    public Company delEmployee(Employee emp,Company com){
        for (int i=o;i<com.employee.length;i++){
            if(com.employee[i]==emp){
                for(int j=i;j<com.employee.length-1;j++){
                    com.employee[j]=com.employee[j+1];
                }
            }
        }
        Company newcom=new Company();
        for(int k;k<com.employee.length-1;k++){
            newcom.employee[k]=com.employee[k];
        }
        return newcom;
    }

    public double viewSalary(Employee emp){
        System.out.println(emp.calSalary());
    }

    public void salarySum(Company com){
        double sum=0;
        for (int i;i<com.employee.length;i++){
            sum+=com.employee[i].calSalary();
        }
        System.out.println(sum);
    }


}
