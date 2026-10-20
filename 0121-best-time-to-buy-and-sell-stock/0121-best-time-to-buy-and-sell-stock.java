class Solution {
    public int maxProfit(int[] arr) {

        int max = 0;
        int min = arr[0];

        for(int i = 1; i<arr.length; i++){
            min = Math.min(arr[i], min);
            max = Math.max(arr[i]- min, max);
        }

        return max;


    }
}





        // if(arr.length == 0) return 0;


        // int max = 0;
        // int min = arr[0];

        // for(int i = 1; i<arr.length; i++){
        //     min = Math.min(arr[i],min);
        //     max = Math.max(max, arr[i] - min);
        // }


        // return max;


        // Brute force------------------>
        // int max = 0;
        // for(int i = 0; i<prices.length; i++){
        //     for(int j = i+1; j<prices.length; j++){

        //         if(prices[j]>prices[i]) max = Math.max(max, prices[j] - prices[i]);
        //     }
        // }

        // return max;
        


//         int buyPrice = prices[0];
//         int profit = 0;
//         for(int i = 1; i<prices.length; i++){
//             buyPrice = Math.min(buyPrice, prices[i]);
//             profit = Math.max((prices[i] - buyPrice), profit);
//         }
//         return profit;