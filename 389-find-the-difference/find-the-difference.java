class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> tb = new HashMap<>();
        char c = ' ';
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            tb.put(c1,tb.getOrDefault(c1,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char c2 = t.charAt(i);
            if(!tb.containsKey(c2)) return c2;
            else{
                tb.put(c2,tb.get(c2)-1);
                if(tb.get(c2)==0) tb.remove(c2);
            }
        }
        return c;
    }
}