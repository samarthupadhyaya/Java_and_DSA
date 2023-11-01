package Lec19;
import java.util.*;
public class coint_toss2 {

    public static void main(String[] args) {

    }

    public static void cointoss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            cointoss(n-1,ans+"H");
        }
        cointoss(n-1,ans+"T");
    }
}
