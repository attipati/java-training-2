package PATTERNS;

import java.util.Scanner;

public class Egg {
    public static void main(String[] args) {
        printEgg();
        
    }
    public static void printEgg(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println("    __________");
        System.out.println("   /          \\");
        System.out.println("  /            \\");
        System.out.println("   -'-\"-'-\"-'- ");
        System.out.println("  \\            /");
        System.out.println( "   \\__________/");
        System.out.println();
        System.out.println();
        }
    }
    
}
