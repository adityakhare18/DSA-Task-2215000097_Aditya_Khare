public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = (end + start)/2;
        int ans = 0;
        while(start < end){
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target){
                start = mid+1;
                ans = mid;
            }
            else if(nums[mid]>target){
                end = mid -1;
            }
            // ans = mid;
            mid = (end + start)/2;

        }
        return ans;
    }
}