class Solution {
    public int[] decimalRepresentation(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        char[] red = s.toCharArray();
        for(int i=0; i<red.length; i++){
            if(red[i]=='0') len--;
        }
        int[] res = new int[len];
        int j = len-1;
        int c = 1;
        while(n!=0 && j>=0){
            int rem = n%10;
            n/=10;
            if(rem == 0){
                c*=10;
            }
            else{
                res[j--] = rem*c;
                c*=10;
            }
        }
        
        return res;
    }
}