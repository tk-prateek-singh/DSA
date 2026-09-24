class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=-1;
        }
        for(int i=(2*n-1);i>=0;i--){
            int index=i%n;
            while(st.size()!=0 && nums[index]>=st.peek()){
                st.pop();
            }
            if(st.size()!=0 && nums[index]<st.peek()){
                ans[index]=st.peek();
                st.push(nums[index]);
            }
            if(st.size()==0){
                st.push(nums[index]);
            }
        }
        return ans;
    }
}