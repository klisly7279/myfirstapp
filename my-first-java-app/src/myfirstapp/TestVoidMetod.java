package myfirstapp;

/**
 * Created by klisly on 8/1/15.
 */
public class TestVoidMetod {

    public  static   void main(String[] args){
        printGrade(78.5);//这里printGrade方法是一个void类型方法，它不返回值。

                         // 一个void方法的调用一定是一个语句。 所以，它被在main方法第三行以语句形式调用。就像任何以分号结束的语句一样。


    }

    public  static  void printGrade(double sorce){
        if (sorce >= 90){
            System.out.println('A');
        }else if (sorce >= 80){
            System.out.println('B');
        }else if (sorce >=70){
            System.out.println('C');
        }else if (sorce >=60){
            System.out.println('D');
        }else {
            System.out.println("E");
        }
        System.out.println("socre is :" + sorce);
    }
}
