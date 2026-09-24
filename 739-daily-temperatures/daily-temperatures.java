class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[n];
        Arrays.fill(ans,0);
        for(int i=n-1;i>=0;i--){
            while(st.size()!=0 && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                st.push(i);
            }
            if(st.size()!=0 && temperatures[i]<temperatures[st.peek()]){
                ans[i]=st.peek()-i;
                st.push(i);
            }
        }
        return ans;
    }
}