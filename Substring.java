import java.util.*;
public class Substring {
    public static String subString(String str,int si,int ei){
        String substring = "";
        for(int i =0;i<ei;i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {
        String str[] = {"apple","mango","banana"};
        String largest = str[0];
        for(int i =0;i<str.length;i++){
            if(largest.compareTo(str[i]) <0){
                largest = str[i];
            }
        }
        System.out.println(largest);

        //System.out.println(subString(str, 0, 5));

    }
}
