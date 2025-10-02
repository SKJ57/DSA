class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int b = numBottles;
        while(numBottles>=numExchange){
            numBottles -= numExchange;
            b++;
            numBottles++;
        }
        return b;
    }
}