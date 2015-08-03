package myfirstapp;

/**
 * Created by klisly on 7/31/15.
 */
class FreshJuice{
    enum FreshJuiceSize{small,middle,large}
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String args[]){
        FreshJuice juice = new FreshJuice();
        //juice.size = FreshJuice.FreshJuiceSize.middle;
        juice.size = FreshJuice.FreshJuiceSize.small;

    }

}
