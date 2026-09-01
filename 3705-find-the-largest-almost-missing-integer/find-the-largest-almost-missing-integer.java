class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();

        //generate subarrays each of size = k
        for(int i=0; i<nums.length-k+1; i++){
            // we shall use a HashSet

            Set<Integer> set = new HashSet<>();

            for(int j=i; j<i+k; j++){
                set.add(nums[j]);
            }

            for(int n : set){
                mp.put(n, mp.getOrDefault(n,0)+1);
            }
        }
        // let's find the largest no. appearing exactly once in the subarrays
        int ans = -1;
        for(int n: mp.keySet()){
            if(mp.get(n)==1){
                ans = Math.max(ans,n);
            }
        }
        return ans;
    }
}