import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income");
        int income = sc.nextInt();
        double TAX =0;
        if(income<500000){
            TAX=0;
            System.out.println("No Incometax!");
        }
        else if(income>500000 && income<1000000){
            TAX =(income*0.2);
            System.out.println("Your tax will be:"+TAX);
        }
        else{
            TAX= (income*0.3);
            System.out.println("Your tax will be:"+TAX);

        }




        

        
    }    
}
