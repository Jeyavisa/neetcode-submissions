class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        
        for(int i=0;i<prices.length;i++){
            int buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                int sell=prices[j];
                
                    maxprofit=Math.max(maxprofit,sell-buy);
                    
                

            }
            
        }
        return maxprofit;
        
    }
}
