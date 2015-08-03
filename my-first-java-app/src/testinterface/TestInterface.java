package testinterface;

/**
 * Created by klisly on 8/3/15.
 */
public class TestInterface implements Animal{
    public void walk(){
        System.out.println("it's walking quickly!");
    }
    public void eat(){
        System.out.println("it eats too much!!");

    }
    public int legs(){
        return 3;
    }

    public static void main(String[] args){
        TestInterface testInterface = new TestInterface();
        testInterface.eat();
        testInterface.walk();
        System.out.println(testInterface.legs());
    }
}
