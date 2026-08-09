class Solution {
    public int smallestNumber(int n, int t) {
    for(int i=n; i<n+100; i++){
        int m = 1;
        int j=i;

        while(j!=0){
            m *= j%10;
            j/=10;
        }

        if(m%t==0){
            return i;
        }
    }
        return 0;
    }
}