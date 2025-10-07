class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int count = 0;
        boolean zer = true;

        for(int i=0; i<n; i++){
            count ^= nums[i];
            if(nums[i]!=0){
                zer = false;
            }
        }
        if(count!=0) return n;
        else return zer? 0: n-1;
    }
}