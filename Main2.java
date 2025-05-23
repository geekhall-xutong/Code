package T3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("aaa/in.txt");
        int len=0;
        byte[] bytes=new byte[3];
        while ((len=in.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        in.close();
        System.out.println("===========");


        FileInputStream in2=new FileInputStream("aaa/in.txt");
        OutputStream out=new FileOutputStream("aaa/out.txt");
        int c=0;
        while((c=in2.read())!=-1){
            out.write(c);
        }
        in2.close();
        out.close();

        OutputStream out3=new FileOutputStream("aaa/out.txt",true);
        String str="XinYuUniversuty";
        byte[] bytes1=str.getBytes();
        for(int i=0;i<bytes1.length;i++){
            out3.write(bytes1[i]);
        }
        out3.close();

        FileOutputStream out4=new FileOutputStream("aaa/out.txt",true);
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        out4.write(str1.getBytes());
        out4.close();
//        byte[] b=in.readAllBytes();
//        for (int i = 0; i < bytes.length; i++) {
//            out.write(bytes[i]);
//        }
//        out.close();

    }
}
