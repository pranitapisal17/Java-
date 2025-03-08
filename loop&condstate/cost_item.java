import java.util.*;
public class cost_item {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Float pencil =sc.nextFloat();
    Float pen = sc.nextFloat();
    Float eraser = sc.nextFloat();
    Float total = pencil +pen+eraser;
    System.out.println(total);

    Float GST = total + (18% total);
    System.out.println("GST is:"+GST);
    
   }
    
}
