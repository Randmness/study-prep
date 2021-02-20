package study.lc.dynamic;

public class BestTimeBuyAndSell {

    //O(n2)
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;

        int max = 0;

        for (int index = 0; index < prices.length-1; index++) {
            int origPurchase = prices[index];
            for (int checkIndex = index+1; checkIndex < prices.length; checkIndex++) {
                max = Math.max(prices[checkIndex]-origPurchase, max);
            }
        }

        return max;
    }

    public int maxProfitTwo(int[] prices) {
        if (prices.length == 1) return 0;

        int minPrice = Integer.MAX_VALUE;
        int max = 0;

        for (int i=0; i< prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            max = Math.max(prices[i]-minPrice,max);
        }

        return max;
    }

}
