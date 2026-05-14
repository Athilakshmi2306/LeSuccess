class Solution {
    public int lengthOfLIS(int[] nums) {
        int size=nums.length;
        int dp[] =new int[size];
        Arrays.fill(dp,1);
        int count=1;  
        for(int i=1; i<size;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                   dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            count=Math.max(count, dp[i]);
        }
        return count;
    }
}