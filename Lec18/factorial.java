package Lec18;
import java.util.*;
public class factorial {


    public static void main(String[] args) {
       int n=5;
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fn=fact(n-1);
        return fn*n;
    }

}
