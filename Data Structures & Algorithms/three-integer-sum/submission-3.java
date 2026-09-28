class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0, n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        while(i < n-2){
            int j = i+1, k = n-1;
            while( j < k){
                List<Integer> list = new ArrayList<>();
                if(nums[i] + nums[j] + nums[k] == 0){
                    // add to list
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while( k > j && nums[k] == nums[k+1]) k--;
                }else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                    while( k > j && nums[k] == nums[k+1]) k--;
                }else{
                    j++;
                    while(j < k && nums[j] == nums[j-1]) j++;
                }
            }
            i++;
            while( i < n-2 && nums[i-1] == nums[i]) i++;
        }

        return ans;

    }
}
