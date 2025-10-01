class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=0; i<=n; i++){
            String bin = Integer.toBinaryString(i);
            int sum = binAdd(bin);
            ans[i] = sum;
        }
        return ans;
    }
    public int binAdd(String b){
        int sum=0;
        for(char c: b.toCharArray()){
            sum += c - '0';
        }
        return sum;
    }
}