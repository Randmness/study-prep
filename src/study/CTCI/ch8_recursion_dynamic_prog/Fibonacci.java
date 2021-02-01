package study.CTCI.ch8_recursion_dynamic_prog;

public class Fibonacci {


    public static void main(String[] args) {
        System.out.println("Fibo: " + fibo(4));
        System.out.println("Fibo Memo: " + fiboMemo(4, new int[5]));
        System.out.println("FiboIter: " + fibo(4));
        System.out.println("FiboIterMemo: " + fibo(4));
    }


    //O(2^n)
    public static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo(n-1) + fibo(n-2);
    }

    //O(n)
    public static int fiboMemo(int n, int[] memo) {
        if (n==0) return 0;
        if (n==1) return 1;

        if (memo[n] == 0) {
            memo[n] = fiboMemo(n-1, memo) + fiboMemo(n-2, memo);
        }

        return memo[n];
    }

    //O(n)
    public static int fiboIter(int n) {
        if (n == 0) return 0;
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i<n; i ++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1 + prev2;
    }

    //O(n)
    public static int fiboIterMemo(int n) {
        if (n == 0) return 0;

        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i<n; i ++) {
            memo[i] = memo[i-1] + memo[i-2];
        }

        return memo[n-1] + memo[n-2];
    }
}
