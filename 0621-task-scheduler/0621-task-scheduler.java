
class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for(char i : tasks){
            freq[i - 'A']++;
        }

        int[] avail = new int[26];

        int count = 0;
        int task = tasks.length;

        while(task > 0){
            int selected = -1;

            for(int i = 0; i<26; i++){
                if(freq[i] > 0 && avail[i] <= count){
                    if(selected == -1 || freq[i] > freq[selected]){
                        selected = i;
                    }
                }
            }

            if(selected != -1){
                freq[selected]--;
                avail[selected] = count+n+1;
                task--;
            }

            count++;
        }

      return count;

    }
}












    //  int[] freq = new int[26];

    //    for(char i : tasks){
    //     freq[i - 'A']++; 
    //    }

    //    int[] avail = new int[26];

    //    int count = 0;

    //    int totalTask = tasks.length;

    //    while(totalTask > 0){

    //     int selected = -1;

    //     for(int i = 0; i<26; i++){
    //         if(freq[i] > 0 && avail[i] <= count){
    //             if(selected == -1 || freq[i] > freq[selected]){
    //                 selected = i;
    //             }
    //         }
    //     }

    //     if(selected != -1){
    //         freq[selected]--;
    //         avail[selected] = count + n + 1;

    //         totalTask--;
    //     }

    //     count++;

    //    }

    //    return count;






















// class Solution {
//     public int leastInterval(char[] tasks, int n) {
//         Boolean[] arr = new Boolean[tasks.length];

//         int count = 0;

//         int[] freq = new int[26];

//         for(int i = 0; i<tasks.length; i++){
//             char currentTask = tasks[i];
//             freq[currentTask - 'A']++;
//         }

//         int totalTask = tasks.length;

//         while(totalTask>0){

//         }
        
//     }
// }