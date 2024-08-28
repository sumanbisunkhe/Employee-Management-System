public class EmployeeTest {
    public static void main(String[] args) {

        // Instance of Employee
        Employee employee = new Employee("Suman", 20, "IT", 20000);

        // Instance of Manager
        Manager manager = new Manager("John", 40, "HR", 50000, 15000);

        // Display information of both Employee and Manager before salary raise
        System.out.println("\n=== Employee and Manager Information Before Salary Raise ===");
        System.out.println("------------------------------------------------------------");
        System.out.println("Employee Information:");
        employee.displayEmployeeInfo();
        System.out.println("------------------------------------------------------------");
        System.out.println("Manager Information:");
        manager.displayEmployeeInfo();
        System.out.println("============================================================\n");

        // Raise the salary of both Employee and Manager by 10%
        employee.raiseSalary(10);
        manager.raiseSalary(10);

        // Display updated information of both Employee and Manager after salary raise
        System.out.println("=== Employee and Manager Information After Salary Raise ===");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Employee Information:");
        employee.displayEmployeeInfo();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Manager Information:");
        manager.displayEmployeeInfo();
        System.out.println("===========================================================\n");
    }
}
