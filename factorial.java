import java.util.*;
public class factorial {
    public static int factorial(int n)
    {
        int res = 1; 
        for(int i = 2;i <=n; i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args){
        int fact = factorial(9);
        System.out.println("the factorial is : " + fact);
    }
}
