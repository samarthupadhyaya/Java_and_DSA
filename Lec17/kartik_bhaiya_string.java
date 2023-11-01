package Lec17;

public class kartik_bhaiya_string {

    public static void main(String[] args) {
        String str="aaaaaaabbbbaabababa";
        int k=3;
        int flipa=maxlen(str,k,'a');
        int flipb=maxlen(str,k,'b');
        System.out.println(Math.max(flipa,flipb));
    }
    public static int maxlen(String str,int k,char ch){
     int ei=0;
     int si=0;
     int ans=0;
     int flip=0;
     while(ei<str.length()){
//         gorwing
         if(str.charAt(ei)==ch){
             flip++;
         }
//         shrinking
         while(flip>k){
             if(str.charAt(si)==ch){
                 flip--;
             }
             si++;
         }
//         ans cal
         ans=Math.max(ans,ei-si+1);
         ei++;
     }
     return ans;
    }
}
