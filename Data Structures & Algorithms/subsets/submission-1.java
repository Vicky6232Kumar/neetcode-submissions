class Solution {
    public void recr(int [] nums, int idx, List<List<Integer>> ans, List<Integer> list){
        if(idx >= nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        recr(nums, idx + 1, ans, list);
        list.remove(list.size()-1);
        recr(nums, idx + 1, ans, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        recr(nums, 0, ans, new ArrayList<>());
        return ans;
    }
}
