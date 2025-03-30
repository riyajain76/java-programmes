import java.util.*;
public class characterpattern {
    public static void main(String[] args){
        char ch='A';
        for(int line = 1; line <= 4; line++){
            for(int j = 1; j <= line; j++ ){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
