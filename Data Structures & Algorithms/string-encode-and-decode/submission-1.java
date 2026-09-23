class Solution {
    // Use String builder
    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder("");
        for (String s : strs) {
            str = str.append(s.length()).append('#').append(s);
        }

        return str.toString();
    }

    int i = 0, j = 0;
    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int n = str.length();

        while (j < n) {
            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));

            String s = str.substring(j + 1, j + len +1);

            ans.add(s);
            j = j + len + 1;
            i = j;
        }

        return ans;
    }
}
