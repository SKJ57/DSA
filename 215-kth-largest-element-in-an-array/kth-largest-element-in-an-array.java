class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = n-k;
        int ans = nums[i];

        return ans;
    }
}