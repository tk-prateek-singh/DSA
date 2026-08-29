class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[(mid+1)%(nums.length)]){
                return nums[(mid+1)%(nums.length)];
            }
            if(nums[mid]<nums[(mid-1+nums.length)%(nums.length)]){
                return nums[(mid)%(nums.length)];
            }
            if(nums[mid]>nums[left]){//left sorted array
                left=mid+1;
            }
            else{//right sorted array
                 right=mid-1;
            }
        }
        return nums[0];
    }
}