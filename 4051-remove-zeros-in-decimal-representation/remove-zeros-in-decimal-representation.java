class Solution {
    public long removeZeros(long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)-'0') != 0) sb.append(s.charAt(i));
        }
        String st = sb.toString();
        return Long.parseLong(st);
    }
}