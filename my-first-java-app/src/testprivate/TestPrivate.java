package testprivate;

/**
 * Created by klisly on 7/31/15.
 */
public class TestPrivate {
    private  String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void print(){
        System.out.println("name is :" +name);
        System.out.println("age is :" +age);

    }


}
