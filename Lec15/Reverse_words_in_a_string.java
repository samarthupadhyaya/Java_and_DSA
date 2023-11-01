package Lec15;
import java.util.*;
public class Reverse_words_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println(s);
        String s = "     the sky is   blue     ";
        System.out.println(Reverse_Words(s));

    }

    public static String Reverse_Words(String s) {
        s = s.trim();
        String[] arr = s.split("\s+");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans = ans + arr[i] + " ";
        }

        return ans.trim();
    }
}
