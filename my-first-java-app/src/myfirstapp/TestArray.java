package myfirstapp;

/**
 * Created by klisly on 8/1/15.
 */
public class TestArray {
    public  static  void  main(String [] args){
        double[] array = {2.1,3.4,2.4,1.1,4.3,2.5};

        //打印出所有的数组元素
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i] + "  ");

        }

        //计算素所有元素的总和
        double total = 0;
        for (int i = 0;i < array.length;i ++){
            total+=total + array[i];
        }
        System.out.println("total is :" +total);

        //查找最大元素
        double max = array[0];
        for (int i= 0;i < array.length;i ++){
            if (array[i]> max){
                max = array[i];
            }
        }
        System.out.println("max is :" + max);
    }
}
