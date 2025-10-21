class Solution {
    public int countSegments(String s) {
        if(s.strip().isEmpty()) return 0;
       String[] str = s.strip().split("\\s+");
       return str.length;
    }
}