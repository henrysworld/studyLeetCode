package week04;

public class MaxProfit {
    public static void main(String[] args) {

    }

    public static int maxProfix(int[] prices){
        int profix = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0) profix += tmp;
        }

        return profix;
    }
}
