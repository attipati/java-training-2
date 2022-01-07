package PATTERNS;

import java.util.Scanner;

public class Victory {
    public static void main(String[] args) {
        Victory obj = new Victory();
        obj.patternVictory();
        
    }
    

public void patternVictory(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(i%3==0){
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        }
        else if(i%2==0){
            System.out.println("|| Victory is mine!! ||");
        }
        else{
            System.out.println("///////////////////////");
        }

    }

}
}
