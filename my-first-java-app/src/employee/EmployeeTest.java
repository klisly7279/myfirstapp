package employee;

/**
 * Created by klisly on 7/31/15.
 */
public class EmployeeTest {


    public static void main (String argsp[]){
        Employee employee1 = new Employee("ZHANGXIAOMING");
        Employee employee2 = new Employee("HUAGNXIAOMING");

        employee1.emAge(12);
        employee1.emSalary(8900.99);
        employee1.printEmployee();

        System.out.println("-----------------------");

        employee2.emAge(45);
        employee2.emSalary(100000.78);
        employee2.printEmployee();

    }
}
