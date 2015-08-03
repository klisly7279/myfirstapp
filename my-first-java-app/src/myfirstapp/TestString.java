package myfirstapp;

/**
 * Created by klisly on 8/1/15.
 */
public class TestString {

    public static void main(String[] args){

        StringBuffer sbuffer = new StringBuffer("test");

        sbuffer.append("  stringbuffer!");
        System.out.println(sbuffer);

        sbuffer.reverse();
        System.out.println(sbuffer);

        System.out.println(sbuffer.lastIndexOf("r"));

        System.out.println(sbuffer.length());

        sbuffer.setCharAt(4, 'h');
        System.out.println(sbuffer);

        sbuffer.setLength(26);
        System.out.println(sbuffer);
        System.out.println("----------------------");
        sbuffer.substring(3);
        System.out.println(sbuffer);


    }


}
