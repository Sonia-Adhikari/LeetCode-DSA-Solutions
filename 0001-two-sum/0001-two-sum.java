class Solution {
    public int[] twoSum(int[] arr, int target) {
      HashMap <Integer, Integer> map = new HashMap<>();

      for(int i = 0; i<arr.length; i++){
        int a = target - arr[i];
        if(map.containsKey(a)){
            return new int[] {map.get(a),i};
        }

        map.put(arr[i], i);
      }

      return new int[] {};
    }

}



    // //Brute force 
    // for(int i = 0; i<nums.length; i++){
    //     for(int j = i+1; j<nums.length; j++){
    //         if(nums[i]+ nums[j] == target){
    //             return new int[] {i,j};
    //         }
    //     }
    // }
    //    return new int[] {};




   
//if array is sorted
// class Solution{
//     public static boolean pairSum1(ArrayList<Integer> list, int target)){
//         int l = 0
//         int r = list.size()-1;
//         while(l<r){
//             if((list.get(l) + list.get(r)) == target){
//                 return new int[] {i,j};
//             }else if((list.get(l) + list.get(r)) < target){
//                 l++;
//             }else{
//                 r++;
//             }
//         }
        
//         return new int[] {};
//     }
// }








    // HashMap<Integer, Integer> map = new HashMap<>();

    // for(int i = 0; i<arr.length; i++){
    //     int a = target - arr[i];

    //     if(map.containsKey(a)){
    //         return new int[]{map.get(a),i};
    //     }

    //     map.put(arr[i], i);
    // }

    // return new int[]{};