class Solution {
    public int lengthOfLongestSubstring(String s) {
     // take a hashmap and maintain the last charater index. two pointer problem,
     // then move the pointer at map.get(ch)  +1    
     HashMap<Character, Integer> map = new HashMap<>();
     int maxLen = 0, j = 0;

     for(int i = 0; i< s.length(); i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            maxLen = Math.max(maxLen, i-j);
            j = map.get(ch) + 1 > j ? map.get(ch) + 1 : j;
        }

        map.put(ch, i);
     }

     maxLen = Math.max(maxLen, s.length()-j);

     return maxLen;

    }
}
