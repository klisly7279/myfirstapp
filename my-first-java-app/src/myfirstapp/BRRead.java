package myfirstapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by klisly on 8/2/15.
 */
public class BRRead {

    public  static void main(String [] args) throws Exception{

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");

        do {
            c = (char)br.read();
            System.out.println(c);
        }while (c != 'q');

    }
}
