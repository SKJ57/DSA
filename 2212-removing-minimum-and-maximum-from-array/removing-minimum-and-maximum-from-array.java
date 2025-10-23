class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n<=1) return n;
        int idx=0, ids=0;

        for(int i=0; i<n; i++){
            if(nums[i]<nums[idx]){
                idx = i;
            }
            else if(nums[i]>nums[ids]){
                ids = i;
            }
        }
        int lt = Math.max(ids,idx) +1;
        int rt = n-Math.min(ids,idx);
        int mx = (Math.min(ids,idx)+1) + (n-Math.max(ids,idx));
        int l1 = Math.min(lt,rt);
        int l2 = Math.min(mx,l1);

        return l2;
    }
}