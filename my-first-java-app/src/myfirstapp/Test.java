package myfirstapp;

/**
 * Created by klisly on 7/31/15.
 */
public class Test {
    public  void puAge(){
        int age = 9;//局部变量 声明后初始化才能使用
        age = age + 7;
        System.out.println("age is :" + age);
    }
    public static  void main(String args[]){
        Test test = new Test();//实例化变量
        test.puAge();

    }


}
