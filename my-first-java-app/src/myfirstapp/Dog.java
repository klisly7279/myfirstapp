package myfirstapp;

/**
 * Created by klisly on 7/31/15.
 */
public class Dog {
    String name;
    int age;
    String color;
    String sex;

    void eat(){

    }
    void walk(){

    }
    void run(){

    }
    void  sleeping(){

    }

    public Dog() {
    }

    public Dog(String name, int age, String color, String sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }


    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }
}
