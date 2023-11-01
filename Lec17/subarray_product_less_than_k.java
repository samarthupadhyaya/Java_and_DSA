package Lec17;
import java.util.*;
public class subarray_product_less_than_k {


    public static void main(String[] args) {
  int[]arr={1,2,3,4,2};
  int k=10;
        System.out.println(subarray_less_than_k(arr,k));
    }
    public static int subarray_less_than_k(int arr[],int k){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length){
//            growing
            p=p*arr[ei];
//            shrinking
            while(p>=k && si<=ei){
                p=p/arr[si];
                si++;
            }
//            calculate
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}
