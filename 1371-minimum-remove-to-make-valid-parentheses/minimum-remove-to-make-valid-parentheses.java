class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer>st=new Stack<>();
        char[] flag=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else if(ch==')'){
                if(st.size()!=0){
                    st.pop();
                }
                else{
                    flag[i]='#';
                }
            }
        }
        //if stack contains extra '(' 
        while(st.size()!=0){
            flag[st.pop()]='#';
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(flag[i]!='#'){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}