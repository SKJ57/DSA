class Solution {
    public double myPow(double x, int n) {
        double p = 1;
        long N = n;

        if(N < 0){
            x = 1/x;
            N= -N;
        }
        while(N>0){
            if(N%2 == 1){
                p*=x;
            }
            x*=x;
            N/=2;
        }
        return p;
    }
}