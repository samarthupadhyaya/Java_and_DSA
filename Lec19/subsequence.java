package Lec19;
import java.util.*;
public class subsequence {

    public static void printsubsequence(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        printsubsequence(ques.substring(1),ans);
        printsubsequence(ques.substring(1),ans+ch);

    }

    public static void main(String[] args) {
        String ques="abc";
        printsubsequence(ques," ");
    }
}
