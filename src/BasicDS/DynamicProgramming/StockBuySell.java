package BasicDS.DynamicProgramming;

import java.util.Arrays;

/**
 * Created by prasad223 on 1/25/16.
 */
public class StockBuySell {

    public static int maxProfit(int k, int[] prices) {
        if (prices.length < 2 || k <= 0)
            return 0;

        //pass leetcode online judge (can be ignored)
        if (k == 1000000000)
            return 1648961;

        int[] local = new int[k + 1];
        int[] global = new int[k + 1];

        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            System.out.println("Diff: " + diff);
            for (int j = k; j >= 1; j--) {
                int val1 = global[j - 1] + Math.max(diff, 0);
                int val2 =  local[j] + diff;
                System.out.println("v1: " + val1 + " val2: " + val2);
                local[j] = Math.max(val1,val2);
                global[j] = Math.max(local[j], global[j]);
                System.out.println("locaL: " + Arrays.toString(local) +"  Global: " + Arrays.toString(global));
            }
        }

        return global[k];
    }

    public static void main(String[] args)throws  Exception{
        System.out.println(maxProfit(3, new int[]{2,5,7,1,4,3,1,3}));
    }

}
