import java.util.*;;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if ((ch == '(') || (ch == '{') || (ch == '[')) {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if ((st.peek() == '(') && (ch == ')'))
                    st.pop();
                else if ((st.peek() == '{') && (ch == '}'))
                    st.pop();
                else if ((st.peek() == '[') && (ch == ']'))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}
