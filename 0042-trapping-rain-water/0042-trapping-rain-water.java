class Solution {
    public int trap(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for(int i = 0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                int item = arr[st.pop()];

                if(!st.isEmpty()){
                    int width = (i - st.peek()) - 1;
                    ans += width * (Math.min(arr[st.peek()],arr[i])- item);
                }
                
            }

            st.push(i);
        }
      
        return ans;
    }
}






  // int ans = 0;
        // int leftMax = 0;
        // int rightMax = 0;

        // int[] leftArr = new int[arr.length];

        // int[] rightArr = new int[arr.length];



        // for(int i = 0; i<arr.length; i++){
        //     leftMax = Math.max(leftMax, arr[i]);
        //     leftArr[i] = leftMax;
        // }

        // for(int i = arr.length-1; i>=0; i--){
        //     rightMax = Math.max(rightMax, arr[i]);
        //     rightArr[i] = rightMax;
        // }

        // for(int i = 0; i<arr.length; i++){
        //     ans += Math.min(leftArr[i], rightArr[i]) - arr[i];
        // }


        // return ans;














//Brute Force
//         int ans = 0;
       
        
//         for(int i = 0; i<arr.length; i++){
//             int leftMax = 0;
//             int rightMax = 0;
        
//             for(int j = i; j>=0; j--){
//                 leftMax = Math.max(leftMax, arr[j]);  
//             } 

//             for(int k = i; k<arr.length; k++){
//                 rightMax = Math.max(rightMax, arr[k]);
//             }

//             ans += Math.min(leftMax, rightMax)-arr[i];
//         }
 
//         return ans;












// int n = height.length;
//         // leftMax
//         int[] leftMax = new int[n];
//         leftMax[0] = height[0];
//         for(int i = 1; i<n; i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }

//         // rightMax
//         int[] rightMax = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i = n-2; i >= 0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         // loop
//         int trappedWater = 0;
//         for(int i= 0; i<n; i++){
//             trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
//         }

//         return trappedWater;