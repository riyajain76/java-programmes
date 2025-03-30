import java.util.*;
public class hollowrectangle 
{
    public static void hollow_rectangle(int totRows , int totColumn){
        for(int i = 1; i <= totRows ; i++){ 
            for(int j =1; j <= totColumn; j++){
                if(i==1 || i==totRows || j==1 || j==totColumn){
                    System.out.print("*");
                }else{
                    System.err.print(" ");
                }
            }
            
            System.out.println();
        }
        
    }
    public static void main (String[] args){
        hollow_rectangle(4, 5);
    }
}
