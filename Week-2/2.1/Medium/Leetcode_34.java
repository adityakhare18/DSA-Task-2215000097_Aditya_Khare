import java.util.Arrays;

public class Leetcode_34 {
    public int firstIndex(int[] arr,int target){
        int s= 0;
       int e = arr.length - 1;
       int ans = -1;
       while(s<=e){
           int mid = s + (e-s)/2;
           if(arr[mid]==target){
               e = mid - 1;
               ans = mid;
           }
           else if(arr[mid]>target){
               e = mid -1;
           }
           else{
               s = mid + 1;
           }
       }
       return ans;
    }
    public int lastIndex(int[] arr,int target){
        int s= 0;
       int e = arr.length - 1;
       int ans = -1;
       while(s<=e){
           int mid = s + (e-s)/2;
           if(arr[mid]==target){
               s = mid + 1;
               ans = mid;
           }
           else if(arr[mid]>target){
               e = mid -1;
           }
           else{
               s = mid + 1;
           }
       }
       return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       int[] arr = new int[2];
       arr[0] = firstIndex(nums,target);
       arr[1] = lastIndex(nums,target);
       Arrays.sort(arr);
       return arr;

    }
}