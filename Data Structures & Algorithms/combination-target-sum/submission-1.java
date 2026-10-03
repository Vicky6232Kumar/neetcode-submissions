class Solution {
    public void dfs(
        int[] nums, int idx, int sum, int target, List<Integer> list, List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        if (idx >= nums.length || sum > target) {
            return;
        }

        list.add(nums[idx]);
        dfs(nums, idx, sum + nums[idx], target, list, ans);
        list.remove(list.size() - 1);

        dfs(nums, idx + 1, sum, target, list, ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, 0, 0, target, new ArrayList<>(), ans);

        return ans;
    }
}
