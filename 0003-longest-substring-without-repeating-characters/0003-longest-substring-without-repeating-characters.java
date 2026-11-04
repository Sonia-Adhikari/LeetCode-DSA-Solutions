class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int l= 0;

        for(int r = 0; r<s.length(); r++){
            char ch = s.charAt(r);

            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
                set.add(ch);

            max = Math.max(max, r-l+1);
            
        }
        return max;  
    }
}










        
//  HashSet<Character> set = new HashSet<>();
      
//       int l = 0;
//       int max = 0;

//       for(int i = 0; i<s.length(); i++){

//         while(set.contains(s.charAt(i))){
//             set.remove(s.charAt(l));
//             l++;
//         }
//         set.add(s.charAt(i));

//         max = Math.max(max, i-l+1);
//       }

//       return max;
























