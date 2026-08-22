class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wins=0;
        for(int i=0;i<k;i++){
            wins=wins+nums[i];
        }
        int maxsum=wins;
        for(int i=k;i<nums.length;i++){
            wins=wins+nums[i];
            wins=wins-nums[i-k];
            maxsum=Math.max(wins,maxsum);
        }
        return (double)maxsum/k;
    }
}