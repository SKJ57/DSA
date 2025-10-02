class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int b = numBottles;

        while(numBottles>=numExchange){
            numBottles -= numExchange;
            b++;
            numBottles++;
            numExchange++;
        }
        return b;
    }
}