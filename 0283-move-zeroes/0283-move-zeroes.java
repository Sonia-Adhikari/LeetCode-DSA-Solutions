class Solution {
    public void moveZeroes(int[] nums) {


        int slow = 0;
        for(int fast = 0; fast<nums.length; fast++){
            if(nums[fast] != 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        } 
       

    }
}

















    //    int i = 0;
    //    for(int j = 0; j<nums.length; j++){
    //     if(nums[j] != 0){
    //         int temp = nums[j];
    //         nums[j] = nums[i];
    //         nums[i] = temp;
    //         i++;
    //     }
    //    }





 // int zero = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] != 0){
        //         int temp = nums[i];
        //         nums[i] = nums[zero];
        //         nums[zero] = temp;
        //         zero++;
        //     }
        // }