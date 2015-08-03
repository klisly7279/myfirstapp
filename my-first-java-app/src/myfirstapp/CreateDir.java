package myfirstapp;

import java.io.File;

/**
 * Created by klisly on 8/2/15.
 */
public class CreateDir {

    public  static  void main (String [] args){

        File f  = new File("C:/DIR/JAVA/HELLO");
        f.mkdirs();
        System.out.println(f.mkdirs());//输出控制台，是否成功出创建文件目录 false 失败

        File file = new File("test.txt");
        System.out.println(file.mkdir());
    }
}
