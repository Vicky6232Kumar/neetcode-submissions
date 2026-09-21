class Solution {
    public boolean isMatched(int matrix[][], int row1, int row2){

        for(int i = 0; i< 26; i++){
            if(matrix[row1][i] != matrix[row2][i]) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int m = strs.length;
        int [][] matrix = new int[m][26];
        for(int i = 0;i < m; i++){
            String s = strs[i];
            for(int j = 0; j < s.length(); j++){
                int idx = s.charAt(j) - 'a';
                matrix[i][idx]++;
            }
        }

        boolean isConsidered[] = new boolean[m];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i< m; i++){
            if(isConsidered[i]) continue;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            isConsidered[i] = true;
            for(int j = i + 1; j < m;j++){
                if(isMatched(matrix, i, j)){
                    list.add(strs[j]);
                    isConsidered[j] = true;
                }
            }
            ans.add(list);
        }

        return ans;
    }
}
