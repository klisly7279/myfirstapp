package xunimethod;

/**
 * Created by klisly on 8/3/15.
 */
public class VirtualDemo {
    public  static void main(String[] args){
        Salary s  = new Salary("John","CHIAN beijing",12,5600.99);
        Employee e = new Salary("mary","GUILIN",25,70000.99);//引用变量  不能调动子类有而父类没有的方法
        System.out.println("Call mailCheck using Salary reference --");
        s.computePay();
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();



    }

}
