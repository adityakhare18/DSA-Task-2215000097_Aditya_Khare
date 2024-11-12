import java.util.*;

public class Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2 = nums2.length;
        int n1 = nums1.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n2;i++){
            map.put(nums2[i],i);
        }
        
        int[] nge = new int[n2];
        Arrays.fill(nge, -1);
        for (int i = n2-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                nge[i] = st.peek();
            }
    
            st.push(nums2[i]);
        }

        int[] ans = new int[n1];
        for(int i=0;i<n1;i++){
            int idx = map.get(nums1[i]);
            ans[i] = nge[idx];
        }
        return ans;
        // return nge;
   }
}
