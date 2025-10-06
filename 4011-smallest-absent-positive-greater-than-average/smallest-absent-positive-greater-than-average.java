class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0, ans=0;
        for(int num: nums){
            if(num>0) set.add(num);
            sum+=num;
        }
        int avg = sum/nums.length;
        if(avg>0) ans = avg+1;
        else ans = 1;
        while(set.contains(ans)){
            ans++;
        }
        return ans;
    }
}