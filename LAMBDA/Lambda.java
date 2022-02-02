package LAMBDA;

public class Lambda {
    public static void main(String[] args) {
        MathLambda math=(a,b)->a+b;
        System.out.println(math.operation(10,20));
        
    }
    
}
@FunctionalInterface
interface MathLambda{
    int operation(int a,int b);

}
