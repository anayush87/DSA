class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s1=new HashSet<>();
        for(int a:nums)
        {
            if(!s1.add(a)) return a;
        }
        return -1;
    }
    
}