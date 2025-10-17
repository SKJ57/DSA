class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num: candyType){
            set.add(num);
        }
        int s = set.size();
        int avl = n/2;

        if(s>=avl) return avl;
        else return s;
    }
}