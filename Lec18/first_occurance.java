package Lec18;

public class first_occurance {

    public static void main(String[] args) {
        int[]arr={2,3,4,3,5,6,7,3,56,3,11};
        int item=3;
        System.out.println(index(arr,item,0));
    }

    public static int index(int[]arr,int item,int idx){

        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==item){
            return idx;
        }
        return index(arr,item,idx+1);
    }
}
