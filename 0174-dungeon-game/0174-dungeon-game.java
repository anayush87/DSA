class Solution {
    Integer dp[][];
    public int calculateMinimumHP(int[][] dungeon) {
        dp=new Integer[dungeon.length][dungeon[0].length];
        return solve(0,0,dungeon);
        
    }
    public int solve(int i,int j,int[][] dungeon)
    {
        
        if(i>=dungeon.length || j>=dungeon[0].length) return Integer.MAX_VALUE;
        if(dp[i][j]!=null) return dp[i][j];
        if(i==dungeon.length-1 && j==dungeon[0].length-1) return Math.max(1,1-dungeon[i][j]);
        int right=solve(i+1,j,dungeon);
        int down=solve(i,j+1,dungeon);
        int hel=Math.min(right,down);
        return dp[i][j]=Math.max(1,hel-dungeon[i][j]);

    }
}