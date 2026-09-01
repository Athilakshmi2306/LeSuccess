class Solution {
    public int pivotInteger(int n) {
        int value=n*(n+1)/2;
        int x=(int) Math.sqrt(value);
        if(x*x==value)
        return x;
        return -1;

    }
}