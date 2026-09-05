class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int w:weights){
            left=Math.max(left,w);
            right+=w;
        }
        int ans=0;
        while(left<=right){
            int day=1;
            int curr=0;
            int mid=left+(right-left)/2;
            for(int i=0;i<weights.length;i++){
                if((curr+weights[i])>mid){
                    day++;
                    curr=weights[i];
                }
                else{
                    curr+=weights[i];
                }
            }
            if(day>days){//need to increase the capacity
                left=mid+1;
            }
            else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
}