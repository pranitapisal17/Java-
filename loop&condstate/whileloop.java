import java.util.Scanner;

public class whileloop {
    public static void main(String[]args){
        int count =0;
        while(count<15){
            System.out.println("HELLO JAVA!");
            count++;
        }
        //print 1-10 numbers
        int counter=1;//initialize the counter to one 
        while(counter<=10){
            System.out.println(counter);
            counter++;//increse the counter
        }


        //take input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number!");
        int number = sc.nextInt();
        int c =1;
        while(c<=number){
            System.out.println(c +"");
            c++;
        }

        // sum of n natural number number 
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int sum = 0; 
        int i = 1 ;
        while(i<=num){
            sum = i+sum;
            i++;
        }
        System.out.println("sum of number is :" +sum);

        //do while loop 
        int count1=1;
        do{
            System.out.println("THIS IS DO WHILE LOOP!");
        }
        while(count1<=6);

    }
    
}
