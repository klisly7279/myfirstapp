package myfirstapp;

/**
 * Created by klisly on 8/2/15.
 */
interface Animalinter{}
class Mamal implements Animalinter{}

public class Doginter extends Mamal{
    public static void main(String[]args){
        Mamal m = new Mamal();
        Doginter d  = new Doginter();
        System.out.println(m instanceof Animalinter);
        System.out.println(d instanceof Mamal);
        System.out.println(d instanceof Animalinter);
    }
}
