class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();

        int[] sc = new int[n];
        sc[0] = s.charAt(0) - 'a' + 1;

        for(int i=1; i<n; i++){
            sc[i] = sc[i-1] + (s.charAt(i) - 'a' + 1);
        }
        int total=sc[n-1];
        for(int i=1; i<n; i++){
            int lsum = sc[i-1];
            int rsum = total - lsum;
            if(lsum==rsum) return true;
        }
        return false;
    }
}