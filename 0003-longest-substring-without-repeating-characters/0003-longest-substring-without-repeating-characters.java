class Solution {
    public int lengthOfLongestSubstring(String s) {

        // HashMap<Charater, Integer> map = new HashMap<>();

        // int count = 0;

        // for(int i = 0; i<s.length; i++){
        //     char ch = s.charAt(i);
        //     if(map.get(ch) == 1)    
        // }


        
 HashSet<Character> set = new HashSet<>();
      
      int l = 0;
      int max = 0;

      for(int i = 0; i<s.length(); i++){

        while(set.contains(s.charAt(i))){
            set.remove(s.charAt(l));
            l++;
        }
        set.add(s.charAt(i));

        max = Math.max(max, i-l+1);
      }

      return max;

      
    }
}




























