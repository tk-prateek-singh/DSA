class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int minLength=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(sum>=target){
                minLength=Math.min(minLength,r-l+1);
            }
            while(sum>target){
                sum-=nums[l];
                l++;
                if(sum>=target){
                    minLength=Math.min(minLength,r-l+1);
                }
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLength;
        }
    }
}