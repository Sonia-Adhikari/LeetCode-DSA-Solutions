class Solution {
    public int findDuplicate(int[] arr) {

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i<nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }else{
        //         map.put(nums[i], 1);
        //     }
            
        // }

        // for(int i = 0; i<nums.length; i++){
        //     if(map.get(nums[i]) > 1){
        //         return nums[i];
        //     }
        // }

        // return -1;


        int i = 0;
        int j = 0;

        do{
            i = arr[i];
            int k = arr[j];
            j = arr[k];
        }while(i!=j);

         i = 0;
        while(i!=j){
            i = arr[i];
            j = arr[j];
        }

        return i;

       
        
    }
}