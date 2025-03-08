import java.util.*;
public class conditionalsta {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();
    System.out.println("Enter your age:"+age);
    if(age>=18){
        System.out.println("Adult.");

    }
    else if(age>10 && age<17){
        System.out.println("Teenager");
    }

    else{
        System.out.println("Child");
    }


   }

    
}
