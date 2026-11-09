class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0;
        int right = n - 1;
        int pos = n - 1; // Start filling from the largest value (end of array)
        
        while (left <= right) {
            // Compare absolute values to see which produces a larger square
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--; // Move the write pointer to the left
        }
        
        return result;
        
    
    }
   
}
















    // int[] result = new int[nums.length];
    //     for(int i = 0; i<nums.length; i++){
    //         result[i] = nums[i]*nums[i];
    //     }
    //     Arrays.sort(result);
    //     return result;