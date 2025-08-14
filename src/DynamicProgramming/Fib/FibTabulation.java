package DynamicProgramming.Fib;

public class FibTabulation {
    static int fib(int x){
        if(x==0 || x==1){
            return x;
        }

        int[] dp = new int[x+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=x; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[x];
    }

    public static void main(String[] args) {
        System.out.println(fib(10000));
    }
}
