package T1;

import java.io.File;

public class Main12 {
    public static void main(String[] args) {
       File f = new File(" F:\\java\\Code\\Class\\src\\T1\\Main7");
       File f1= new File("F:\\java\\Code\\Class\\src\\T1\\Main7\\Main8.java");
       System.out.println(f.exists());
        System.out.println(f.getAbsoluteFile());
    }
}
