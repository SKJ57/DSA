class Solution {
    public int totalMoney(int n) {
        int t = 0;
        for(int i=0; i<n; i++){
            t += 1 + (i%7) + (i/7);
        }
        return t;
    }
}