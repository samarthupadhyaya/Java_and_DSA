package Lec1;

public class increment_decrement {
    public static void main(String[] args) {
//        post decrement
        int a=6;
        System.out.println(a++);
        System.out.println(a);

        int b=12;
        System.out.println(b++);
        System.out.println(b);



//        pre-increment
        int c=13;
        System.out.println(--c);
        System.out.println(c);


        int d=14;
        System.out.println(--d);
        System.out.println(d);


        int x=a++ + --a - ++a + 11 + a++ - a-- + ++a;
        System.out.println(x);
    }
}
