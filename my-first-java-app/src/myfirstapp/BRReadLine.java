package myfirstapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by klisly on 8/2/15.
 */
public class BRReadLine {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}
