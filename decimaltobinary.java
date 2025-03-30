import java.util.*;
public class decimaltobinary {
    public static void dectobin(int decNum){
        int binNum = 0;
        int rem = 0 ; 
        int pow = 0;
        while(decNum > 0){
            rem = decNum % 2;
            binNum= binNum + (rem * (int)Math.pow(10,pow));
            pow++; 
            decNum = decNum / 2;
        }
        System.out.println("the binary number is : " + binNum);
    }
    public static void main(String[] args) {
        dectobin(19);
    }
}
