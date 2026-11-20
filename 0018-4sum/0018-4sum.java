class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i< n-3; i++){
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i+1; j<n-2; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int s = j+1;
                int e = n-1;
                while(s<e){
                    long total = (long) nums[i]+nums[j]+nums[s]+nums[e];
                    
                    if(total == target){
                        list.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[s], nums[e])));
                        s++;
                        e--;
                        while (s < e && nums[s] == nums[s - 1]) s++;
                        while (s < e && nums[e] == nums[e + 1]) e--;
                    }else if(total<target){
                        s++;
                    }else{
                        e--;
                    }
                }
            }
        }

        return list;
        
    }
}