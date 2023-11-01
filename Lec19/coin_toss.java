package Lec19;
import java.util.*;
public class coin_toss {
    public static void main(String[] args) {
    int n=3;
        cointoss(n,"");
    }
    public static void cointoss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        cointoss(n-1, ans + "H");
        cointoss(n-1,ans+"T");
    }
}
