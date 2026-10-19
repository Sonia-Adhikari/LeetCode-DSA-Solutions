class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){

                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i]) == 1){
                return nums[i];
            }
        }

        return -1;


    }
}


















//    for(int i = 0; i<nums.length; i++){
//             boolean unique = true;
//             for(int j = 0; j<nums.length; j++){
//                 if(i != j && nums[i] == nums[j]){
//                     unique = false;
//                     break;
//                 }else{
//                     unique = true;
//                 }
//             }
//             if(unique){
//                 return nums[i];
//             }
//         }
//         return -1;