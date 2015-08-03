package myfirstapp;

/**
 * Created by klisly on 8/1/15.
 */
public class ConsDemon {
    public  static void main(String [] args){
        MyClass01 myClass = new MyClass01(10);
        System.out.println(myClass.x);//直接取x的值
    }
}

//外部类
 class MyClass01{
    int x;
    MyClass01(int i) {
        x = i;
    }
}