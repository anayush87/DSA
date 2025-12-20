class Solution {
    Boolean dp[];
    public boolean canJump(int[] nums) {
        dp=new Boolean[nums.length];
        return solve(0,nums);
    }
    private boolean solve(int i,int nums[])
    {
        if(i>=nums.length-1) return true;
        if(nums[i]==0 ) return false;
        if(dp[i]!=null) return dp[i];
        for(int s=1;s<=nums[i];s++)
        {
            if(solve(i+s,nums)) return dp[i]=true;
        }
        dp[i] = false;
        return false;

    }
}