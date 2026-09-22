class Solution {
    public int maxDistance(int[] position, int m) {
        int low=1;
        Arrays.sort(position);
        int high=position[position.length-1]-low;
        int ans=0;
        while(low<=high){
            int gap=low+(high-low)/2;
            if(canPlace(position,m,gap)){
                ans=gap;
                low=gap+1;
            }
            else{
                high=gap-1;
            }
        }
        return ans;
    }
    public boolean canPlace(int[] position,int m,int gap){
        int count=1;
        int last=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-last >= gap){
                count++;
                last=position[i];
                if(count==m){
                  return true;
                }
            }
        }
        return false;
    }
}