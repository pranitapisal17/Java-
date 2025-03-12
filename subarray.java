public class subarray {

    public static void sub_array(int number[]){
        int totalsubarray=0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end= j;
                for(int k=start;k<=end;k++){
                    System.out.print(+number[k]+" ");
                    totalsubarray++;
                }
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("The total subarray are :" +totalsubarray);
    }  
    public static void main(String[]args){
        int number[]={2,4,6,8,10,12};
        sub_array(number);

    }
    
}
