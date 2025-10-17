class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length-1];
        int len = Math.min(first.length(), last.length());
        int idx=0;
        for(int i=0; i<len; i++){
            if(first.charAt(i)==last.charAt(i)){
                idx++;
            }
            else break;
        }
        return first.substring(0,idx);
    }
}