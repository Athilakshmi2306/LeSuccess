class Solution {
    public int findNthDigit(int n) {
        long digitlength=1;
        int count=9;
        int start=1;
        while(n>digitlength*count){
            n-=digitlength*count;
            digitlength++;
            count=count*10;
            start=start*10;

        }
        long number= start+(n-1)/digitlength;
        int index=(int)((n-1)%digitlength);
        String s=String.valueOf(number);
          return s.charAt(index)-'0';
    }
}