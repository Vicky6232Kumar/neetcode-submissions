class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int m = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0;i < m; i++){
            String s = strs[i];
            int [] temp = new int[26];
            for(int j = 0; j < s.length(); j++){
                int idx = s.charAt(j) - 'a';
                temp[idx]++;
            }
            String key = Arrays.toString(temp); 

            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        List<List<String>> ans = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
}
