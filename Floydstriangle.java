import java.util.*;
public class Floydstriangle {
    public static void floydstriangle(int n){
        int cnt = 1;
        for(int i = 1; i <= n ; i++ ){
            for(int j =1; j<=i; j++){
                System.out.print(cnt);
                cnt++;
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        floydstriangle(5);
    }
}
