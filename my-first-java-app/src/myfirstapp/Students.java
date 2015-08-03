package myfirstapp;

/**
 * Created by klisly on 7/31/15.
 */
public class Students {
    private String name;
    private int age;
    private double sore;

    public  Students(String stuName) {
        name = stuName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSore(double sore) {
        this.sore = sore;
    }
    public void print(){
        System.out.println("name is :"+name);
        System.out.println("age is :" + age);
        System.out.println("socre is :" + sore);
    }
    public  static  void  main (String args[]){
        Students stu = new Students("haliliport");
        stu.setAge(12);
        stu.setSore(89);
        stu.print();


    }
}
