package Lec4;

public class GCD {
    public static void main(String[] args) {
        int dividend = 36;
        int divisor = 60;

        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;

        }
        System.out.println(divisor);

//		for (; dividend % divisor != 0;) {
//			int rem = dividend % divisor;
//			dividend = divisor;
//			divisor = rem;
//		}
    }
}
