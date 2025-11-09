class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer,ArrayList<Integer>> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!mp.containsKey(nums[i])){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                mp.put(nums[i],arr);
            }
            else{
                mp.get(nums[i]).add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int key: mp.keySet()){
            ArrayList<Integer> arr = mp.get(key);
            if(arr.size()<3) continue;
            for(int i=0; i<=arr.size()-3; i++){
                int f=arr.get(i), s=arr.get(i+1), t=arr.get(i+2);
                min = Math.min(min,(Math.abs(f-s)+Math.abs(s-t)+Math.abs(t-f)));
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}