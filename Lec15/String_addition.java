package Lec15;

public class String_addition {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Bye";
        String s = s1 + s2;
        String s4 = "Kaju" + s1;
        String s5 = "Kaju" + " katli";
        // String s3 = s1.concat(s2);
        System.out.println(s);
        // System.out.println(s3);
        System.out.println("Hey" + 10 + 30 + "Bye" + 4 + 2);
        System.out.println(2 + 3 + "Bye" + 5 + 5);
        System.out.println("Hey" + (10 + 30) + "Bye" + 4 + 2);
        System.out.println(10 + 30 + ("hey" + "bye") + "Bye" + 4 + 2);
    }
}
