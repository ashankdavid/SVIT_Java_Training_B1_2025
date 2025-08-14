package DynamicProgramming.Fib;

// memoization - DP
public class FibMemoization {
    static int fib(int x, int[] dp){
        if(x==0 || x==1){
            return x;
        }
        if(dp[x]!=0){  // step 2
            return dp[x];
        }
        dp[x] = fib(x-1, dp) + fib(x-2, dp); //step 3
        return dp[x];

    }

    public static void main(String[] args) {
        int n = 45;
        int[] dp = new int[n + 1]; // step 1
        int result = fib(n, dp);
        System.out.println(result);
    }
}
