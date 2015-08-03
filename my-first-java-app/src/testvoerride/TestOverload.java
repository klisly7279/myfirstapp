package testvoerride;

/**
 * Created by klisly on 8/2/15.
 */
public class TestOverload {
    public int test(){
        System.out.println("test1");
        return 1;
    }
    public void test(int i){
        System.out.println("test2");
    }
    public String test(int i,String s){
        System.out.println("test3");
        return "returntest3";
            }
    public String test4(String s,int i){
        System.out.println("test4");
        return "returntest4";
    }
    public static void main(String[] args){
        TestOverload o = new TestOverload();
        o.test();
        o.test(1);
        System.out.println(o.test(1, "test3"));
        System.out.println(o.test4("test4",1));


    }

}
