class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(int)Math.sqrt(c);
        while(a<=b)
        {
            long val=a*a+b*b;
            if(val==c) return true;
            if(val>c)
            {
                b-=1;
            }
            else
            {
                a+=1;
            }
            
        }
        return false;
    }
}