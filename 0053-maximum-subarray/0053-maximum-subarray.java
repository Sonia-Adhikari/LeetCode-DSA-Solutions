class Solution {
    public int maxSubArray(int[] arr) {
      int currSum = arr[0];
      int maxSum = arr[0];

      for(int i=1; i<arr.length; i++){
        currSum = Math.max(arr[i], arr[i]+currSum);
        maxSum = Math.max(maxSum, currSum);
      }

      return maxSum;
    }
}











        // int currentSum = 0;
        // int maxSum = nums[0];

        // for(int i = 0; i < nums.length ; i++){
        //     currentSum += nums[i];
        //     maxSum = Math.max(maxSum, currentSum);

        //     if(currentSum < 0){
        //         currentSum = 0;
        //     }
        // }
        // return maxSum;