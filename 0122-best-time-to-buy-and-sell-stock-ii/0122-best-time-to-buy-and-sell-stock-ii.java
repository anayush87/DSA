class Solution {
    Integer dp[][];
    public int maxProfit(int[] prices) {
        dp=new Integer[prices.length][2];
        return solve(0,1,prices);
    }
    public int solve(int i,int canBuy,int prices[])
    {
        if(i>=prices.length)
        {
            return 0;
        }
        if(dp[i][canBuy]!=null) return dp[i][canBuy];
        int buy;
        int skip;
        int sell;
        if(canBuy==1)
        {
            buy=-prices[i]+solve(i+1,0,prices);
            skip=solve(i+1,1,prices);
            return dp[i][canBuy]=Math.max(buy,skip);
        }
        else
        {
            sell=prices[i]+solve(i+1,1,prices);
            skip=solve(i+1,0,prices);
            return dp[i][canBuy]=Math.max(sell,skip);
        }
        
    }
}