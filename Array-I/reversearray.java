public class reversearray {

    public static void reverse(int number[]){
        int first=0;
        int last=number.length-1;

        //using swap we can reverse the array 

        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;

        }

    }
    public static void main(String[]args){
        int number[]={2,4,6,8,10};

        reverse(number);

        //for printing the reverse array we use for loop 

        for(int i=0;i<=number.length-1;i++){
            System.out.println(number[i] +" ");
        }


    }
    
}
