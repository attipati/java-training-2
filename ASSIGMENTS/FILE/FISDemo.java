package ASSIGMENTS.FILE;
import java.io.*;
public class FISDemo{
    public static void main(String[] args) throws IOException {
       // readDataCharacterStream() ;
        //readDataByteStream();
       // readDataLineByLine();
       writeIntoFile("good morning");



    }
    static void writeIntoFile(String data) throws IOException{
        FileWriter fwriter=new FileWriter("movies.txt",true); // append =true
        PrintWriter pwriter =new PrintWriter(fwriter);
        pwriter.println(data);
        pwriter.flush();
        fwriter.close();
    }
    static void readDataLineByLine() throws IOException
    {
        FileReader filereader = new FileReader("Data.txt");
        BufferedReader bReader= new BufferedReader(filereader);
        String line=null;
        while((line=bReader.readLine())!=null)
        {
            System.out.println(line);

        }
        bReader.close();
        
    }
        
    static void readDataByteStream() throws IOException{
    FileInputStream fis=new FileInputStream("Data.txt");
    int data;
    while((data=fis.read())!=-1)
    {
        System.out.print((char)data);
    }
    fis.close();
    }
    

    static void readDataCharacterStream() throws IOException
    {
        FileReader fReader=new FileReader("Data.txt");
        int data;
        while((data=fReader.read())!=-1){
            System.out.print((char)data);
        }
        fReader.close();
        
    

    }
    
}
