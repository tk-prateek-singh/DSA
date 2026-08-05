class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j=0;
        int current_count=0;
        int max_ans=0;
        while(j<nums.length){
            if(nums[j]==1){
                current_count++;
                j++;
                max_ans=Math.max(current_count,max_ans);
            }
            else{
                current_count=0;
                j++;
            }
        }
        return max_ans;
    }
}