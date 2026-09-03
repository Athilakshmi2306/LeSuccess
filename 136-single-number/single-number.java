class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int single:nums){
            result=result^single;
        }
        return result;
    }
}