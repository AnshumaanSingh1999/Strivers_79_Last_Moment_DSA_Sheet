import java.util.*;
public class minimum_add_to_make_parentheses_valid_coding_ninjas {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        char ch=' ';
        int lc=0;
        int rc=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(st.empty()){
                st.push(ch);
                if(ch=='{'){
                    lc++;
                }                
                else if(ch=='}'){
                    rc++;
                }
            }
            else if(!st.empty()){
                if(ch=='{'){
                    st.push(ch);
                    lc++;
                }
                else if(ch=='}' && st.peek()=='{'){
                    lc=lc-1;
                    rc=rc-1;
                    st.pop();
                }
                else{
                    st.push('}');
                    rc++;
                }
            }
        }
        

        if(!st.isEmpty()){
            if(lc==rc){
                c=lc;
            }
            else if(rc%2==0 && rc%2==0){
                c=rc/2+rc/2;
            }
            else{
                c=-1;
            }
        }
        else{
            c=0;
        }
        
        System.out.println(st.pop());
        return c;
    }
    public static void main(String[] args) {
        String x="{}}";
        minimum_add_to_make_parentheses_valid cl=new minimum_add_to_make_parentheses_valid();
        int resp=cl.minAddToMakeValid(x);
        System.out.println(resp);
    }   
}