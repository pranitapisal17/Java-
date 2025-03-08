import java.util.*;
public class dowhile {
    public static void main(String[]args){
        int i =1;
        do{
            System.out.println("THIS IS DO WHILE LOOP!");
            i++;
        }
        while(i<=5);
//break statement for exiting from loop 
        for(int j=1;j<=6;j++){
            System.out.println(j);
            if(j==4){
                break;
            }
        }
        System.out.print("J==4 MATCH AND EXIT FROM LOOP!");

       
        
    
    }
    
}
