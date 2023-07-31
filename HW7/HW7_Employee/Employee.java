package HW7.HW7_Employee;

public class Employee {
    private String id;
    private String name;
    private int salary;

    Employee(String id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    //calculate yearly salary for employee
    public int getAnnualSalary(){
        int annualSalary= getSalary()*12;
        System.out.println("Your salary per month: "+ getSalary() +" and your salary per year: "+ annualSalary);
        return annualSalary;
    }

    // calculate raised salary based on perecent
    public int raisedSalary(int perecent){
        int raised = (perecent* getSalary()) / 100;
        raised+=getSalary();

        System.out.println("Your salary before raised: "+ getSalary() +" and your salary after raised: "+ raised +" (increased by "+perecent+"%)");
        return raised;
    }

    // print employee data
    public String toString() {
        return System.out.printf("Employee data: %nId: "+ getId()+"%nName: "+ getName() +"%nSalary: "+ getSalary()+"%n").toString();
    }


}
