import java.util.*;
public class maxsumsubarray {

    public static void max_subarray_sum(int number[]){
        int current_sum =0;
        int max_sum= Integer.MIN_VALUE;

        for(int i=0; i<number.length;i++){
            int start=i;
            for (int j=i;j<number.length;j++){
                int end=j;
                current_sum=0;
                for(int k=start;k<=end;k++){
                    current_sum+=number[k];


                }
                System.out.println(current_sum);
                if(current_sum > max_sum){
                    max_sum=current_sum;


                }
            }

        }
        System.out.println("max sum is" +max_sum);

    }

    


    public static void main(String[]args){
        int number[]={1,-2,6,-1,3};
        max_subarray_sum(number);



    }
    
}
