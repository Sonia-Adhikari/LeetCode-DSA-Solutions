class Solution {
    public int majorityElement(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
           
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        }


        for(int i : arr){
            if(map.get(i) > arr.length/2) return i;
           
        }

        return -1;
  
    }
}




  // Brute Force------------>
  // int count = 1;
        // int candidate = nums[0];
        // for(int i = 1; i < nums.length; i++){
        //     if(count == 0){
        //         candidate = nums[i];
        //         count++;
        //     }else if(candidate == nums[i]){
        //         count++;
        //     }else{
        //         count--;
        //     }
        // }
        // return candidate;





         // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i<arr.length; i++){
        //     map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        // }

        // int max = arr.length/2;

        // for(int i = 0; i<arr.length; i++){
        //     if(map.get(arr[i]) > max) return arr[i];
        // }

        // return -1;
