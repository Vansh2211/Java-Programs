public class BuyAndSellStock {
    
    static int stockPrice(int[] prices){
        int minSofar = prices[0];
        int res = 0;

        for(int i=0;i<prices.length;i++){
            minSofar =  Math.min(minSofar,prices[i]);

            res = Math.max(res,prices[i] - minSofar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices= {7, 10, 1, 3, 6, 9, 2};
        System.out.println(stockPrice(prices));
    }
}
