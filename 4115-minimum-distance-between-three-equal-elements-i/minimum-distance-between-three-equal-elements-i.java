class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        if(n<3) return -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int ans = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                        min = Math.min(min,ans);
                    }
                }
            }
        }
        if (min==Integer.MAX_VALUE) return -1;
        return min;
    }
}