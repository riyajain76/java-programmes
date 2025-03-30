import java.util.*;
public class bincoeff {
    public static int factorial(int n){
        int res = 1;
        for(int i = 2 ; i <= n; i++){
            res *= i;
        }
        return res ;
    }
    public static int binomialcoefficient(int n , int r){
        int nfactorial = factorial(n);
        int rfactorial = factorial(r);
        int nrfactorial = factorial(n-r);
        int bc = nfactorial / (rfactorial * nrfactorial);
        return bc;
    }
    public static void main(String[] args) 
    {
        int binomialcoefficient = binomialcoefficient(9, 8);
        System.out.println("the binomial coefficient is : " + binomialcoefficient);
    }
}
