package Lec17;
import java.util.*;
public class sliding_window_algo {
public static int maxsum(int[]arr,int k){
    int sum=0;
    int ans=0;
    for (int i = 0; i <k ; i++) {
        sum+=arr[i];
    }
    ans=sum;
    for (int i = k; i <arr.length ; i++) {
        sum+=arr[i]; //growing
        sum-=arr[i-k]; //shrinking
        ans=Math.max(ans,sum);
    }
    return ans;
}
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,6,7,9,4,5};
        int k=3;
        System.out.print(maxsum(arr,k));
    }
}
