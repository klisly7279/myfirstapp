package encapsulation;

/**
 * Created by klisly on 8/3/15.
 */
public class RunEncap {
    public static void main(String[] args){
        EncapTest encapTest = new EncapTest();
        encapTest.setIdNum(12);
        encapTest.setName("booh");
        encapTest.setAddress("beijing hutong");
        System.out.println(" idNUM is : " + encapTest.getIdNum()
                + "   name is : " + encapTest.getName()
                + "   address is : " +encapTest.getAddress() );
    }
}
