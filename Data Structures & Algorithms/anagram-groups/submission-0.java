class Solution {
    public boolean isAnagram(String s1, String s2){
        int n = s1.length();
        if (n != s2.length()) return false;

        int [] arr = new int[26];
        for(int i = 0; i < n; i++){
            int idx1 = s1.charAt(i) - 'a';
            int idx2 = s2.charAt(i) - 'a';

            arr[idx1]++;
            arr[idx2]--;
        }

        for(int ele : arr){
            if(ele != 0) return false;
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        boolean isConsidered [] = new boolean[n];
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(isConsidered[i]) continue;

            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            isConsidered[i] = true;

            for(int j = i+1; j < n; j++){
                if(isAnagram(strs[i], strs[j])){
                    list.add(strs[j]);
                    isConsidered[j] = true;
                }
            }

            ans.add(list);
        }

        return ans;
    }
}
