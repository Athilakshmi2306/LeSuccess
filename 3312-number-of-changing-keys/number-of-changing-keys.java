class Solution {
    public int countKeyChanges(String s) {
        char str[]=s.toLowerCase().toCharArray();
        int count =0;
        for(int i=0;i<str.length-1;i++){
            if(str[i]!=str[i+1])
            count ++;
        }
        return count;
    }
}