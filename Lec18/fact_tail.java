package Lec18;
import java.util.*;
public class fact_tail {

    public static void main(String[] args) {
     int n=5;
        System.out.println(fact(n,1));
    }
    public static int fact(int n,int ans){
        if(n==0){
            return 1;
        }
        return fact(n-1,ans*n);
    }

}
