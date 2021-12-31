
import java.util.Scanner;
public class Assignment1
{
        public void add(int a,int b)
        {
            System.out.println(a+b);
        }
        public void sub(int a,int b)
        {
            System.out.println(a-b);  
        }

        public void mul(int a,int b)
        {
            System.out.println(a*b);  
        }
        public void div(int a,int b)
        {
            System.out.println(a/b);  
        }
        public void mod(int a,int b)
        {
            System.out.println(a%b);  
        }
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    Assignment1 ar=new Assignment1();
    int a=sc.nextInt();
    int b=sc.nextInt();
    ar.add(a,b);
    ar.sub(a,b);
    ar.mul(a,b);
    ar.div(a,b);
    ar.mod(a,b);
}    
}