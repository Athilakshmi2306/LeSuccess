class Solution {
    public static void backtrack(int[]nums,int start,List<Integer>temp,List<List<Integer>>res){
        if(start==nums.length)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[start]);
        backtrack(nums,start+1,temp,res);
        temp.remove(temp.size()-1);
        backtrack(nums,start+1,temp,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
}