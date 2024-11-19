```java
class Solution {
    public static void print(int[] arr,int target,ArrayList<Integer> list,List<List<Integer>> ans,int lp){
        if(target==0){
            if(!ans.contains(list))
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;
        for(int i = lp;i<arr.length;i++){
            list.add(arr[i]);
            print(arr,target-arr[i],list,ans,i+1);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        print(candidates,target,list,ans,0);
        return ans;
    }
}
```