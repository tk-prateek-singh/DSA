class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int a=1;
        int b=2;
        while(n>=3){
            int temp=a+b;
            a=b;
            b=temp;
            n--;
        }
        return b;
    }
}