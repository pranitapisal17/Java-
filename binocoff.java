package functions;
import java.util.*;
public class binocoff {
    public static int factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialcoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r =factorial(r);
        int fact_nmr= factorial(n-r);

        int binocoffe = fact_n/(fact_r * fact_nmr);
        return binocoffe;
    }
    public static void main(String[]agrs){
        System.out.println(binomialcoff(5, 2));
    }   
}
