```java
class Solution {
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;

            i++;
            j--;
        }
        return true;
    }
    public void print(String s,List<List<String>> ans ,List<String> list){
        if(s.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<s.length();i++){
            String temp = s.substring(0,i+1);
            if(isPalindrome(temp)){
                list.add(temp);
                print(s.substring(i+1),ans,list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        print(s,ans,list);
        return ans;
    }
}
```