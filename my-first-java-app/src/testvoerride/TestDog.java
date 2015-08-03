package testvoerride;

/**
 * Created by klisly on 8/2/15.
 */
class Animal{
    void move(){
        System.out.println("ANIMAL IS RUNNING");
    }
}
class Dog extends Animal{
    void  move(){
        System.out.println("DOG IS  BARKING");

            }
    void bark(){
        System.out.println("-----------BARK()");
    }
}
public class TestDog {
    public static void main(String[] args){
        Animal a = new Animal();
        Animal b = new Dog();//b 是Animal 的一个引用  不用调用父类没有的方法 要想调用自己的方法 则需要创建本类的对象
        a.move();
        b.move();
        Dog dog = new Dog();
        dog.bark();
    }
}
