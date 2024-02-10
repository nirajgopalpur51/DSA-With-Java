import java.util.*;
public class ClimbingStairs {
    public static int climbStairs(int n) {
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        return climbStairsHelper(n, ways);

        // if(n<=3){
        //     return n;
        // }
        // int a=3;
        // int b=2;
        // for(int i=0; i<n-3; i++){
        //     a=a+b;
        //     b=a-b;
        // }
        // return a;
    }

    private static int climbStairsHelper(int n, int[] ways) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (ways[n] != -1) return ways[n];

        ways[n] = climbStairsHelper(n - 1, ways) + climbStairsHelper(n - 2, ways);

        return ways[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
}
