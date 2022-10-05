public class App {
    public static void main(String[] args) throws Exception {
        Employee employee1 = new Employee("Mustafa", 903.23, 40, 2015);
        Employee employee2 = new Employee("Yiğit", 7582.86, 41, 2008);
        
        employee1.setSalary(employee1.getSalary() - employee1.tax() + employee1.bonus() + employee1.raiseSalary());
        employee2.setSalary(employee2.getSalary() - employee2.tax() + employee2.bonus() + employee2.raiseSalary());
        
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
