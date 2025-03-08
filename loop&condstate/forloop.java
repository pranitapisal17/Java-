public class forloop {
    public static void main(String[]args){
        for (int i=1;i<=10; i++){
            System.out.println(i);

        }

        for (int l=1;l<=4;l++){
            System.out.println("****");//print the square pattern of star
        }

        System.out.println("using while loop");
        int line=1;
        while(line<=4){
            System.out.println("****");
            line++;
        }

        //print reverse of number 
        int n=12345;
        while(n>0){
            int last_num = n%10;
            System.out.print(last_num);
            n=n/10;
        }

    }
    
}
