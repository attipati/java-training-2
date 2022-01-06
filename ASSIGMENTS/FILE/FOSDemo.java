package ASSIGMENTS.FILE;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("Data3.txt");
        fos.write(5);
        fos.close();
    }
    
}
