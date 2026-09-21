class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int n=bloomDay.length;
        int ans=-1;
        if((long)m*k>n){
            return -1;
        }
        for(int i=0;i<n;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;//looking for min value
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public boolean canMake(int[] bloomDay,int m,int k,int mid){
        int flower=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                flower++;
                if(flower==k){
                    bouquets++;
                    flower=0;
                    if(bouquets==m){
                        return true;
                    }
                }
            }
            else{
                //flowers has nt bloomed
                //adjacent break
                flower=0;
            }
        }
        return false;
    }
}