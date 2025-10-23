class Solution {
    public int[] runningSum(int[] nums) {
        int[] psum = new int[nums.length];
        psum[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            psum[i] = psum[i-1] + nums[i];
        }
        return psum;
    }
}