
class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];
        int[] nextAvailable = new int[26];

        for (int i = 0; i < tasks.length; i++) {
            freq[tasks[i] - 'A']++;
        }

        int totalTask = tasks.length;
        int count = 0;

        while (totalTask > 0) {

            int selected = -1;

            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0 && nextAvailable[i] <= count) {
                    if (selected == -1 || freq[i] > freq[selected]) {
                        selected = i;
                    }
                }
            }

            if (selected != -1) {
                freq[selected]--;
                totalTask--;

                nextAvailable[selected] = count + n + 1;
            }

            count++;
        }

        return count;
    }
}























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