package Lec1;

public class max_num {
    public static void main(String[] args) {
        int a=7;
        int b=3;
        int c=5;
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
