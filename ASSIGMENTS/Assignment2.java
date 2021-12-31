package ASSIGMENTS;
import java.util.Scanner;
public class Assignment2 
{
    public void largestOfThree(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+"is greater than"+b+"and"+c);
        }
        else if(b>a && b>c){
            System.out.println(b+"is greater than "+a+" and "+c);
        }
        else{
            System.out.println(c+"is greater than "+a+" and "+c);
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Assignment2 as=new Assignment2();
        as.largestOfThree(a,b,c);
    }

    

    
}
