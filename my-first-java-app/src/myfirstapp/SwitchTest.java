package myfirstapp;


/**
 * Created by klisly on 8/1/15.
 */
public class SwitchTest {
    public  static void main(String[] args){
        int season =3;
        String strSeason;
        switch (season){
            case 1:
                strSeason = "spring";
                break;
            case  2:
                strSeason = "summer";
                break;
            case  3:
                strSeason ="fall";
                break;
            case 4:
                strSeason ="winter";
                break;
            default:
                strSeason ="not season";


        }
        System.out.println(strSeason);
    }
}
