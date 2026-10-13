class Solution {
    public int firstUniqChar(String s) {


  HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }


        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    
      

    }
}















  //     if(s.length() == 0){
    //         return -1;
    //     }

    //     int[] arr = new int[26];
    //     int i = 0;

    //     uni(s, i, arr);

    //     return findUni(s, 0, arr);

    // }

    // public static void uni(String s,int i, int[] arr){
    //     if(s.length() == i){
    //         return;
    //     }

    //     arr[s.charAt(i) - 'a']++;

    //     uni(s, i+1, arr);

    // }

    // public static int findUni(String s, int i, int[] arr){
    //     if(s.length() == i){
    //         return -1;
    //     }
    //     if(arr[s.charAt(i) - 'a'] == 1) return i;

    //     return findUni(s, i+1, arr);
    // }