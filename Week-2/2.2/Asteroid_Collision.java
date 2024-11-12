import java.util.*;
public class Asteroid_Collision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i : asteroids){
            if(i>0) st.push(i);

            else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(i))
                st.pop();

                if(st.isEmpty() || st.peek() < 0)
                st.push(i);
                else if(st.peek()==Math.abs(i))
                st.pop();
            }
        }
        int n = st.size();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}
