package myfirstapp;

/**
 * Created by klisly on 7/31/15.
 */
public class Techer {
    String name;
    int age;
    private static String sex;//静态变量
    public static final double SALARY = 7896.89;//声明为常量的静态变量  可以用类名直接访问静态变量

    public void setAge(int age) {
        this.age = age;
    }
    public  static  void main(String args[]){
        Techer techer = new Techer();
        techer.name = "zhangyimou";
        techer.setAge(67);
        sex = "man";
        System.out.println("name is :"+ techer.name + "  "+"性别 :"+sex +" " +"工资 :"+Techer.SALARY);
    }
}

