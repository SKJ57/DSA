class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int freqC = 0, total = 0;
        
        for (int num : nums){
            int f = freq.getOrDefault(num,0)+1;
            freq.put(num,f);
            freqC = Math.max(freqC,f);
        }
        
        for(int val: freq.values()){
            if(val==freqC){
                total += freqC;
            }
        }
        return total;
    }
}