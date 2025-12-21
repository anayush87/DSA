class Solution {
    public int findTheWinner(int n, int k) {
ArrayList<Integer> l1=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            l1.add(i);
        }
        return solve(l1,k,0);
        
    }
    public int solve(List<Integer> l1,int k,int idx)
    {
        if(l1.size()==1) return l1.get(0);
        idx = (idx+k-1) % l1.size();
        l1.remove(idx);
        
        return solve(l1, k, idx);
    }

}