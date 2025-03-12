package functions;
import java.util.*;
public class prodnum {
    
    public static void product(int num1 , int num2){
        int Total = num1*num2;
        System.out.println("Product of two number is:" +Total);
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int num1 =sc.nextInt();
        System.out.println("enter 2nd number:");
        int num2 =sc.nextInt();
        product(num1,num2);


    }
    
}
