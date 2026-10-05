class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        //if k is still greater than 0
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        //removing leading zeros
        int i=0;
        while(i<ans.length() && ans.charAt(i)=='0'){
            i++;
        }
        ans=new StringBuilder(ans.substring(i));
        if(ans.length()==0){
            return "0";
        }
        return ans.toString();
    }
}