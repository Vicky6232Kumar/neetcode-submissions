class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if(n != t.length()) return false;
        int count[] = new int[26];
        for(int i = 0; i<n;i++){
            char ch = s.charAt(i);
            int idx = ch-'a';
            count[idx]++;
        }

        for(int i = 0; i<n;i++){
            char ch = t.charAt(i);
            int idx = ch - 'a';
            count[idx]--;
        }

        for(int i : count){
            if(i != 0) return false;
        }

        return true;

        
    }
}
