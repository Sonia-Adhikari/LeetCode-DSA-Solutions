class Solution {
    public void sortColors(int[] nums) {

        int f = 0;
        int m = 0;
        int l = nums.length-1;

        while(m<=l){
            if(nums[m] == 0){
                swap(nums, f, m);
                f++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else {
                swap(nums, m, l);
                l--;
            }
        }

    }


      public static void swap(int[] arr, int a , int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }
}









 // int start = 0;
        // int end = nums.length-1;


        // for(int i = 0; i<nums.length; i++){
        //     int mid = (end - start)/2;

          
        // }











//   int low  = 0;
//         int mid = 0;
//         int high = nums.length -1;

//         while(mid <= high){
//             if(nums[mid] == 0){
//                 swap(nums, low, mid);
//                 low++;
//                 mid++;
//             }else if(nums[mid] == 1){
//                 mid++;
//             }else{
//                 swap(nums, mid, high);
//                 high--;
//             }
//         }
        
//     }
    
// void swap(int[] nums, int i, int j){
//     int temp = nums[i];
//     nums[i] = nums[j];
//     nums[j] = temp;




//         int[] arr = new int[nums.length];

//         int k = 0;


//         for(int i = 0; i<nums.lenght; i++){
//             for(int j = 0; j<nums.length; j++){
//                 if(nums[j] == 0){
//                     arr[k] = nums[j]; 
//                 }else if(nums[])
//             }
//         }