class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int teamskill=skill[0]+skill[n-1];
        long chemistry=0;
        int left=0;
        int right=n-1;
        while(left<right){
            if(skill[left]+skill[right]!=teamskill){
                return -1;
            }
            chemistry+=(long) skill[left]*skill[right];
            left++;
            right--;
        }
        return chemistry;
    }
}