package functions;
import java.util.*;
public class swap {

    public static void swap(int a, int b){
        int temp= a;
        a = b;
        b=temp;
        // System.out.println("After Swapping of the number");
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        swap(a,b);
        
    }
    
}
