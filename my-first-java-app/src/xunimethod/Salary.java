package xunimethod;

/**
 * Created by klisly on 8/3/15.
 */
public class Salary extends  Employee{
        private double salary;
    public Salary(String name, String address, int number,double salary) {
        super(name, address, number);//直接继承父类的变量
        setSalary(salary);
    }

    public void mailCheck(){  //重写父类的方法
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);

    }

    public double getSalary() {  //子类的get方法
        return salary;
    }

    public void setSalary(double newSalary) {//子类的set方法
        if (newSalary >=0.0){
            salary = newSalary;
        }
    }
    public double computePay()
    {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
