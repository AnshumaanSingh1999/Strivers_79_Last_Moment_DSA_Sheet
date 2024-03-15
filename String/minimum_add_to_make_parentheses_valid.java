//Accepted
import java.util.*;
class minimum_add_to_make_parentheses_valid{
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        char ch=' ';
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(st.empty()){
                st.push(ch);
            }
            else if(!st.empty()){
                if(ch=='('){
                    st.push(ch);
                }
                else if(ch==')' && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(')');
                }
            }
        }

        if(!st.isEmpty()){
            c=st.size();
        }
        return c;
    }
    public static void main(String[] args) {
        String x="()";
        minimum_add_to_make_parentheses_valid cl=new minimum_add_to_make_parentheses_valid();
        int resp=cl.minAddToMakeValid(x);
        System.out.println(resp);
    }
}