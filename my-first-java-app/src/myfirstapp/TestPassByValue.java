package myfirstapp;

/**
 * Created by klisly on 8/1/15.
 */
public class TestPassByValue {
    public static void  main(String [] args){

        int n1 = 1;
        int n2 = 2;

        System.out.println("before swap  n1 is  " + n1 + "   n2 is  " + n2);
        swap(n1, n2);
        System.out.println("after swap  n1 is  " + n1 + "   n2 is  " + n2);

    }
    public static void swap(int num1, int num2){
        System.out.println("before swap  num1 is  " + num1 + "  num2 is  " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swap  num1 is  " + num1 + "  num2 is  " + num2);

    }
}
