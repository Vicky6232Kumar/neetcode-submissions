class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l < r){
            int mid = (r+l)/2;
            if(mid == l){
                return Math.min(nums[r], nums[l]);
            }
            else if(nums[mid] > nums[r]){
                l = mid;
            }else if(nums[l] < nums[mid] && nums[mid] < nums[r] || nums[mid] < nums[l]){
                r = mid;
            }
        }

        return Math.min(nums[r], nums[l]);
    }
}
