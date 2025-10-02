class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int b = numBottles;
        while(numBottles>=numExchange){
            int n = numBottles/numExchange;
            int k = numBottles%numExchange;

            b += n;
            numBottles = n + k;
        }
        return b;
    }
}