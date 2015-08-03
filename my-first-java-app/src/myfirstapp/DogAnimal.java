package myfirstapp;

/**
 * Created by klisly on 8/2/15.
 */
public class DogAnimal extends Animal {
    public static  void main(String [] args){
     //   Animal a = new Animal();
        DogAnimal d = new DogAnimal();

        System.out.println(d instanceof Animal);
    }
}
