```java
class Solution {
    public void print(int[] arr,int target,List<List<Integer>> ans,List<Integer> list,int idx){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(target>=arr[i]){
            list.add(arr[i]);
            print(arr,target-arr[i],ans,list,i);
            list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        print(candidates,target,ans,list,0);
        return ans;
    }
}
```