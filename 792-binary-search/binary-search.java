class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(nums[mid]==target){
        //         return mid;
        //     }
        //     if(nums[mid]>target){
        //         end=mid-1;
        //     }
        //     else{
        //         start=mid+1;
        //     }
        // }
        return binary(nums,target,start,end);
    }
    public int binary(int[] nums,int target,int s,int e){
        int mid=s+(e-s)/2;
        if(s>e){
        return -1;
        }
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return binary(nums,target,s,mid-1);
        }
        else{
            return binary(nums,target,mid+1,e);
        }
    }
}