class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        if(n<=1) return false;
        while(n>2){
            int[] sum = new int[n-1];
            for(int i=0; i<n-1; i++){
                sum[i] = (s.charAt(i)-'0' + s.charAt(i+1)-'0')%10;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<sum.length; i++){
                sb.append(sum[i]);
            }
            s = sb.toString();
            n--;
        }
        return s.charAt(0)==s.charAt(1);
    }
}