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
            for(int k=1;k<=2;k++){
            System.out.print("    +---------+");
            }
        
        System.out.println();
            if(i%2==0){
                for(int k=1;k<=2;k++){

            System.out.print("    |  united |");
                }
                System.out.println();
                for(int k=1;k<=2;k++){

            System.out.print("    |  states |");
                }
                System.out.println();

            }
            else{
                for(int k=1;k<=2;k++){

                System.out.print("    |         |");
                }
                System.out.println();
                for(int k=1;k<=2;k++){
                System.out.print("    |         |");
                }
                System.out.println();
                }
      }
      for(int k=1;k<=2;k++){
        System.out.print("    +---------+");
      }
      System.out.println();
      
        duplicatePattern();
      
        
    


    }


        
    }

    public static void duplicatePattern() {
        for(int k=1;k<=2;k++){
            System.out.print("       /  \\     ");
        }
        System.out.println();
        for(int k=1;k<=2;k++){
            System.out.print("      /    \\");
        }
        System.out.println();
        for(int k=1;k<=2;k++){
            System.out.print("     /      \\");
        }
        System.out.println();
    }

}