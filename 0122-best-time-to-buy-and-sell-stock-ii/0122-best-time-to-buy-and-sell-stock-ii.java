class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n+1][2];
        int profit=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<2;j++)
            {
                if(j==0)
                {
                    dp[i][j]=Math.max(-prices[i]+dp[i+1][1],dp[i+1][0]);
                }
                else{
                    dp[i][j]=Math.max(prices[i]+dp[i+1][0],dp[i+1][1]);
                }
                
            }
        }
        return dp[0][0];
    }
    // public int solve(int i,int canBuy,int prices[])
    // {
    //     if(i>=prices.length)
    //     {
    //         return 0;
    //     }
    //     if(dp[i][canBuy]!=null) return dp[i][canBuy];
    //     int buy;
    //     int skip;
    //     int sell;
    //     if(canBuy==1)
    //     {
    //         buy=-prices[i]+solve(i+1,0,prices);
    //         skip=solve(i+1,1,prices);
    //         return dp[i][canBuy]=Math.max(buy,skip);
    //     }
    //     else
    //     {
    //         sell=prices[i]+solve(i+1,1,prices);
    //         skip=solve(i+1,0,prices);
    //         return dp[i][canBuy]=Math.max(sell,skip);
    //     }
        
    // }
}