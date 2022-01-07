package PATTERNS;

import java.util.Scanner;

public class TwoRockets{
    public static void main(String[] args) {
        printRockets();
        
    }
    public static void printRockets(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n;j++){
        
        duplicatePattern();
       
        for(int i=1;i<=3;i++){
            System.out.println("    +---------+");
            if(i%2==0){

            System.out.println("    |  united |");
            System.out.println("    |  states |");
            }
            else{

                System.out.println("    |         |");
                System.out.println("    |         |");
                }
        }
        System.out.println("    +---------+");
        duplicatePattern();
    


    }


        
    }

    public static void duplicatePattern() {
            System.out.println("       /  \\     ");
            System.out.println("      /    \\");
            System.out.println("     /      \\");
    }

}