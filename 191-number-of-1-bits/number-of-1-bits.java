class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;

        for(int num: s.toCharArray()){
            if(num=='1'){
                count++;
            }
        }
        return count;
    }
}