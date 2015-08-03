package testmethod;

/**
 * Created by klisly on 8/3/15.
 */
public class Students extends Pulil{
    private double socre;
    public Students(int id,String name,String address,double socre) {
        super(id,name,address);
        setSocre(socre);

    }
    public void mail(){
        System.out.println("mail to student "+ getId() + getName() + getAddress() +getSocre());
        System.out.println("==================== ");
    }

    public double getSocre() {
        return socre;
    }

    public void setSocre(double newSocre) {
        if (newSocre >= 0.00){
            socre = newSocre;
        }
    }
}
