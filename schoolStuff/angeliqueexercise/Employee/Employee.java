public class Employee {
    String ID, firstName, lastName;
    double salary, percent;
    
    public void getID() {
        System.out.println("Employee ID: " + ID);
    }
    
    public void getName() {
        System.out.println("Employee Name: " + firstName + lastName);
    }

    public void getFirstName() {
        System.out.println("Employee's First Name: " + firstName);
    }

    public void getLastName() {
        System.out.println("Employee's Last Name: " + lastName);
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void getAnnualSalary() {
        System.out.println("Annual Salary: " + (salary + salary * percent));
    }

    public void raiseSalary(double percent) {
        this.percent = percent;
    }
}
