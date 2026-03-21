class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n=grid.length;
       int size=n*n;
       int[] count=new int[size+1];
       for (int[] row : grid) 
       { 
        for (int num : row) 
       { 
        count[num]++; 
        } 
        } 
        int repeated=-1;
        int missing=-1;
        for(int i=1;i<=size;i++){
            if(count[i]==2) repeated=i;
            if(count[i]==0) missing=i;
        }
        return new int[]{repeated, missing};
    }
}