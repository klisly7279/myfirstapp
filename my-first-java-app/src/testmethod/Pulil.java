package testmethod;

/**
 * Created by klisly on 8/3/15.
 */
public class Pulil {
    private  int id;
    private String name;
    private String address;

    public  String toString(){
        return  name + ", " + address;

    }

    public Pulil(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public  void mail(){
        System.out.println("mail to student : "+ getName() + getAddress());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
