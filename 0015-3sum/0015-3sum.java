// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {

//         List<List<Integer>> list = new ArrayList<>();

//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 for(int k = j+1; k<nums.length; k++){
                    
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);

//                         list.add(li);
//                     }
//                 }
//             }
//         }

//         return list;
        
//     }
// }




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        // 1. Sort the array first (Crucial for the two-pointer technique)
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // 2. Skip duplicate values for the first element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // 3. Initialize two pointers for the remaining part of the array
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet! Add it to your list
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // 4. Skip duplicate values for the left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, move the left pointer rightward to get a larger number
                    left++;
                } else {
                    // Sum is too big, move the right pointer leftward to get a smaller number
                    right--;
                }
            }
        }
        
        return list;
    }
}
