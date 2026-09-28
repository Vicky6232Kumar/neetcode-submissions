class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, currMin = Integer.MAX_VALUE;
        for(int i = 0; i< prices.length; i++){
            currMin = Math.min(currMin, prices[i]);
            max = Math.max(max, prices[i] - currMin);
        }

        return max;
    }
}
