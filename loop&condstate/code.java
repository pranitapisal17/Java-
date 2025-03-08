import java.util.*;

public class code {
    public static void main(String[] args) { 
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number:");
            int num =sc.nextInt();   
            if(num%10==0){
                break;
            }
            System.out.println(num);  
        }while(true); 
        
        
        do{
            Scanner sc1= new Scanner(System.in);
            System.out.println("enter b:");
            int b = sc1.nextInt();
            if(b%10==0){
                continue;
            }
            System.out.println("b was" +b);

        }while(true);
}
}
