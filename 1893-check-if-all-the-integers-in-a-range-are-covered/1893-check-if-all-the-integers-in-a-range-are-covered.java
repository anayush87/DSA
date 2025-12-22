class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean ans[]=new boolean[51];
        for(int row[]:ranges)
        {
            for(int i=row[0];i<=row[1];i++)
            {
                ans[i]=true;
            }
        }
        for(int i=left;i<=right;i++)
        {
            if(!ans[i]) return false;
        }
        return true;
    }
}