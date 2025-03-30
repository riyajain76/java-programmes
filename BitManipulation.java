import java.util.*;
public class BitManipulation{
    public static void evenOrodd(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            //even number
            System.out.println("even number ");
        }else{
            System.out.println("odd number");
        }
    }
    public static void getithbit(int n,int i){
        int bitmask=1;
        if((n & (1<<i)) ==0){
            System.out.println(i+"th bit is 0");
        }else{
            System.out.println(i+"th bit is 1");
        }
    }
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearithBit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static int updateithBit(int n,int i,int newbit){
        // if(newbit==0){
        //     return clearithBit(n, i);
        // }else{
        //     return setithbit(n, i);
        // }
        n = clearithBit(n, i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }
    public static boolean isPoweroftwo(int n){
        return (n & (n-1))==0;
    }
    public static void main(String[] args){
        // System.out.println((5 & 6));
        // System.out.println((5 | 6));
        // System.out.println((5 ^ 6));
        // System.out.println((~5));
        // System.out.println((5 << 2));
        // System.out.println((6 >> 1));
        // evenOrodd(3);
        // evenOrodd(11);
        // evenOrodd(14);
        // getithbit(16, 5);
        // System.out.println(setithbit(15, 5));
        // System.out.println(updateithBit(10, 2, 1));
        System.out.println(isPoweroftwo(16));
    }
}