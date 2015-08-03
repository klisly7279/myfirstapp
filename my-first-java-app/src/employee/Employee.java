package employee;

/**
 * Created by klisly on 7/31/15.
 */
public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name) {

        this.name = name;
    }
    public  void emAge(int empAge){
        age = empAge;
    }
    public  void  emSalary(double emSalary){
        salary = emSalary;

    }
    public  void printEmployee(){
        System.out.println("name :" +name);
        System.out.println("age :" +age);
        System.out.println("salary :"+ salary);
    }

}
