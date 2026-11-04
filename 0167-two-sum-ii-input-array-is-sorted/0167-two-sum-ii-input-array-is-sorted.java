class Solution {
    public int[] twoSum(int[] arr, int target) {

        int l = 0;
        int r = arr.length-1;

        while(l<r){
            int curr = arr[l] + arr[r];
            if(curr == target){
                return new int[] {l+1, r+1};
            }else if(curr > target){
                r--;
            }else{
                l++;
            }
        }
        return new int[] {};
    
    }
}







// int s = 0;
//         int e = arr.length-1;
//         while(s<e){
//             if((arr[s] + arr[e]) == target){
//                 return new int[] {s+1,e+1};
//             }else if((arr[s] + arr[e]) <target){
//                 s++;
//             }else{
//                 e--;
//             }
//         }
//         return new int[] {};