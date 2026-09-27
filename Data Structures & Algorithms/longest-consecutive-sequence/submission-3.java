class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }

        int len = 0,maxLen = 0;
        Set<Integer> start = new HashSet<>();
        for(int it : set){
            if(!set.contains(it-1)){
                start.add(it);
            }
        }

        for(int it : start){
            int num = it;
            while(set.contains(num)){
                len++;
                num++;
            }
            maxLen = Math.max(maxLen, len);
            len =0;
        }

        return maxLen;
    }
}
