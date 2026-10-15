class Solution {
    public int subarraySum(int[] arr, int k) {


        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currSum = 0;

        map.put(0,1);

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            int required = currSum - k;

            if(map.containsKey(required)){
                count += map.get(required);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);

            }

          return count;




          //Brute force
        // int count = 0;

        // for(int i = 0; i<arr.length; i++){
        //     int sum = 0;

        //     for(int j = i; j<arr.length; j++){

        //         sum += arr[j];

        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }

        // return count;

    }
}