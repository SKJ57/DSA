class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        int count=2, max=2;

        for(int i=2; i<n; i++){
            int psum = nums[i-1] + nums[i-2];
            if(nums[i]==psum){
                count++;
            }
            else{
                count = 2;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}