class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        
        int dp[]=new int[n];
        int subs[] = new int[n];
        
        int max=1;
        Arrays.fill(dp,1);
        Arrays.fill(subs,1);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(dp[j]+1>dp[i]){
                        dp[i] = dp[j]+1;
                        subs[i] = subs[j];
                    }
                    else if(dp[j]+1==dp[i]){
                       
                        subs[i] += subs[j];
                    }

                }
            }
            max=Math.max(dp[i],max);
        }
        int count=0;
       for(int i=0 ; i<n ; i++){
        if(dp[i]==max){
            count+=subs[i];
        }
       }

        return count;
    }
}