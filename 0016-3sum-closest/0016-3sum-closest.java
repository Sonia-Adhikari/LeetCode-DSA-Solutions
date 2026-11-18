class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

         int closestSum = nums[0] + nums[1] + nums[2];

        for(int i = 0; i<nums.length; i++){
            int s = i+1;
            int e = nums.length-1;
           
            while(s<e){
               
                int currSum = nums[i] + nums[s] + nums[e];
                
                if(Math.abs(target - currSum) < Math.abs(target - closestSum)){
                    closestSum = currSum;
                }
                
                if(currSum < target){
                    s++;
                }else if(currSum > target){
                    e--;
                }else{
                    return currSum;
                }

            }
        }

        return closestSum;
        
    }
}