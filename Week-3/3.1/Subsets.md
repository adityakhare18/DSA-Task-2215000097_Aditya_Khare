```java
class Solution {
    public void print(int[] arr,int lp,List<List<Integer>> ans,List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=lp;i<arr.length;i++){
            list.add(arr[i]);
            print(arr,i+1,ans,list);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        print(nums,0,ans,list);
        return ans;
    }
}
```