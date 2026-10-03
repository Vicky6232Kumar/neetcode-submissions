class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int num : nums){
            List<List<Integer>> dummy = new ArrayList<>(ans);
            for(List<Integer> lst : dummy){
                List<Integer> newLst = new ArrayList<>(lst);
                newLst.add(num);
                ans.add(newLst);
            }
        }

        return ans;
    }
}
