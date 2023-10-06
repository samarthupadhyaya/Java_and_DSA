package Lec2;
import java.util.*;
public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = -1;
        while (row <= n) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if (row == 1) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            // next Row ki Prep
            row++;
            System.out.println();
            star--;
            space += 2;

        }

    }

}
