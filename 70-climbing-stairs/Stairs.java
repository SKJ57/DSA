import java.util.*;
//using recursion
public class Stairs {
    public static int climbStairs(int n) {
        if(n==1 || n==2){
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = climbStairs(n);
        System.out.println(res);
    }

}
