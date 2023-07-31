package HW7.HW7_Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee =new Employee("11000", "Razan", 25000);

        //call method toString that's print employee data
        employee.toString();
        //call method toString that's calc yearly salary for the employee
        employee.getAnnualSalary();
        //call method toString that's calc raised salary for the employee
        employee.raisedSalary(90);
    }
    }
