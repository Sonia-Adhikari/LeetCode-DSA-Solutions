class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
           
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0) + 1);
              
        }


        for(int i = 0; i<t.length(); i++){
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }else{
                map2.put(t.charAt(i), 1);
            }      
        }


        return map1.equals(map2);

    }

}




















    //  public boolean isAna(String s, String t, int idx, int[] arr){

    //      if(idx == s.length()){
    //             return Arrays.stream(arr).allMatch(val -> val == 0);
    //     } 
         
    //         arr[s.charAt(idx) - 'a']++;
    //         arr[t.charAt(idx) - 'a']--;

    //     return isAna(s, t, idx+1 , arr);


    // }









      // if(s.length() != t.length()){
        //         return false;
        //    }

        // int[] arr = new int[26];
        // int idx = 0;

        // return isAna(s, t, idx, arr);

        // if(s.length() != t.length()) return false;

        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     // if(map.containsKey(s.charAt(i)))
        //         map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+ 1);
            
            
        // }

        // for(int i = 0; i<s.length(); i++){
        //     if(map.containsKey(t.charAt(i))){
        //        map.put(t.charAt(i) , map.get(t.charAt(i))- 1);
        //     }else{
        //         return false;
        //     }
            
        // }

        // for(int freq : map.values()){
        //     if(freq != 0) return false;
        // }

        // return true;
        
