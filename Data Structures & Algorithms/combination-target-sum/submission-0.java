class Solution {

    public void dfs(int []nums, int idx, int sum, int target, List<Integer> list, List<List<Integer>> ans){
        if(idx >= nums.length || sum > target){
            return;
        }else if(sum == target){
            ans.add(new ArrayList<>(list));
        }

        for(int i = idx; i< nums.length; i++){
            list.add(nums[i]);
            dfs(nums, i, sum + nums[i], target, list, ans);
            list.remove(list.size()-1);
            // dfs(nums, i+ 1, sum + nums[i], target, list,ans);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, 0, 0, target, new ArrayList<>(), ans);

        return ans;
    }
}
