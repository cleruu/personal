public class App {
    public static void main (String[] args) {
        Employee a = new Employee();
        a.ID = "20-10298";
        a.setSalary(25000.00);
        a.raiseSalary(.15);

        Employee b = new Employee();
        b.firstName = "Cassandra ";
        b.lastName = "Lopez";
        b.setSalary(30000.00);
        b.raiseSalary(.10);
        
        a.getID();
        b.getName();
        a.getSalary();
        b.getSalary();
        a.getAnnualSalary();
        b.getAnnualSalary();
    }
}
