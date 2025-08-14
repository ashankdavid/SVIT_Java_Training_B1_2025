package DynamicProgramming.Fib;

public class Fib {
    static int fib(int x, int[] dp){
        if(x==0 || x==1){
            return x;
        }
        if(dp[x]!=0){
            return dp[x];
        }
        dp[x] = fib(x-1, dp) + fib(x-2, dp);
        return dp[x];

    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        int result = fib(n, dp);
        System.out.println(result);
    }
}
