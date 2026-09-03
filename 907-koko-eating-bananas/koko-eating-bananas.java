class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed=1;
        int maxSpeed=0;
        for(int i=0;i<piles.length;i++){
            maxSpeed=Math.max(maxSpeed,piles[i]);
        }
        int ans=0;
        while(minSpeed<=maxSpeed){
            int k=minSpeed+(maxSpeed-minSpeed)/2;
            long hours=0;
            for(int i=0;i<piles.length;i++){
                hours+=(piles[i]+k-1)/k;
            }
            if(hours<=h){
                ans=k;
                maxSpeed=k-1;//looking for less possible speed
            }
            else{//takes more time than given h
                minSpeed=k+1;//needs to increase the speed
            }
        }
        return ans;
    }
}