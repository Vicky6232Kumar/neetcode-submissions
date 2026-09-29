class Solution {
    public int characterReplacement(String s, int k) {
        int [] map = new int[26];
        int max = 0;

        int left = 0, right = 0;
        while(right < s.length()){
            int idx = s.charAt(right) - 'A';
            map[idx]++;
            int maxChar = 0;
            for(int i = 0; i < 26; i++){
                maxChar = Math.max(maxChar, map[i]);
            }

            while(right-left+1 - maxChar > k) 
            {
                int removeIdx = s.charAt(left) - 'A';
                map[removeIdx]--;
                left++;
            }

            max = Math.max(max, right-left+1);
            right++;

        }

        return max;
    }
}
