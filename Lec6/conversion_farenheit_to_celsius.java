package Lec6;
import java.util.*;
public class conversion_farenheit_to_celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minf = sc.nextInt();
        int maxf = sc.nextInt();
        int steps = sc.nextInt();
        for (int i = minf; i <= maxf; i = i + steps) {
            int c = (int) ((5 / 9.0) * (i - 32));
            System.out.println(i + "\t" + c);

        }

    }
}
