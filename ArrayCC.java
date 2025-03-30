import java.util.*;
public class ArrayCC {
    public static void update(int marks[]){
        for(int i =0; i <marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        return largest;
    }
    public static int binarySearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            //comparison 
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid +1;

            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void reverseArray(int numbers[]){
        int first = 0;
        int last= numbers.length -1;
        while(first < last){
            //temp'
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void pairsArray(int numbers[]){
        for(int i = 0 ; i<=numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1;j <=numbers.length;j++){
                System.out.print("( " + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void printSubArray(int numbers[]){
        for(int i = 0 ; i<= numbers.length;i++){
            int start = i;
            for(int j =i ;j<numbers.length;j++){
                int end = j;
                for(int k = start;k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void maxSubArraySum(int numbers[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];

        //calculating prefix array
        for(int i = 1;i<=prefix.length;i++){
            prefix[i] = prefix[i-1] +numbers[i];
        }
        for(int i = 0 ; i<= numbers.length;i++){
            int start = i;
            for(int j =i ;j<numbers.length;j++){
                int end = j;
                currSum= start ==0? prefix[end]: prefix[end] - prefix[start-end];;
                
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void kadaneAlgorithm(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if(cs <0 ){
                cs =0;
            }
            ms = Math.max(cs,ms);

        }
        System.out.println("max sum is : " + ms);
    }
    public static void main(String args[]) {
        int numbers[] ={-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgorithm(numbers);
        // pairsArray(numbers);
        // maxSubArraySum(numbers);
        // reverseArray(numbers);
        // for(int i=0;i<=numbers.length;i++){
        //     System.out.print("the reverse array is " + numbers[i]);
        // }
        // int key = 10;
        // System.out.println(binarySearch(numbers, key));

        // System.out.println("largest value is " + getLargest(numbers));
        // int marks[]={97,98,88};
        // update(marks);
        // for(int i = 0 ; i<marks.length;i++){
        //     System.out.println(marks[i] + " ");
        // }
        // int mark[] = new int[100];
        // //taking input from user for mark 
        // Scanner sc = new Scanner(System.in);
        // //mark at 0th index
        // mark[0] = sc.nextInt();
        // mark[1] = sc.nextInt();
        // mark[2] = sc.nextInt();

        // System.out.println("physics : "+mark[0]);
        // System.out.println("chemistry : "+mark[1]);
        // System.out.println("maths: "+mark[2]);
        //passing array as argument
    }
}
