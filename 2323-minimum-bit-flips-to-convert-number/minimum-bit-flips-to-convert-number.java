class Solution {
    public int minBitFlips(int start, int goal) {
        String xor = Integer.toBinaryString(start^goal);
        int count = 0;
        for(char c: xor.toCharArray()){
            if (c=='1') count++;
        }
        return count;
    }
}