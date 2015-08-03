package myfirstapp;

/**
 * Created by klisly on 8/1/15.
 */
public class TestMax {
    public  static  void  main(String[] args){
        int i = 5;
        int j =2;
        int k = max(i,j);//当方法返回一个值的时候，方法调用通常被当做一个值。

        System.out.println("the max is in " + i + " and  " + j +"  is " + k);

    }
    public static int max(int num1,int num2){
        int result;
        if (num1 > num2){
            result =  num1;

        }else {
            result =  num2;
        }
        return result;

    }


}
