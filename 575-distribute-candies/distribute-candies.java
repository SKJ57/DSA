class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Arrays.sort(candyType);
        int count = 1;
        for(int i=1; i<n; i++){
            int c = candyType[i];
            if(c!=candyType[i-1]){
                count++;
            }
        }
        int avl = n/2;
        if(count>=avl) return avl;
        else return count;
    }
}