class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        if(n<=1) return false;
        while(n>2){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n-1; i++){
                sb.append((s.charAt(i)-'0'+s.charAt(i+1)-'0')%10);
            }
            s = sb.toString();
            n--;
        }
        return s.charAt(0)==s.charAt(1);
    }
}