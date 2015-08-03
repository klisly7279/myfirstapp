package myfirstapp;

/**
 * Created by klisly on 7/31/15.
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("pass name :"+ name);

    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public int getPuppyAge() {
        System.out.println("getPuppyAge is :" + puppyAge);
        System.out.println("======================");
        return puppyAge;
    }

    public  static  void main(String args[]){
        Puppy puppy = new Puppy("TONY");
        puppy.setPuppyAge(3);
        puppy.getPuppyAge();
        System.out.println("varibale is :" + puppy.puppyAge);

    }
}
