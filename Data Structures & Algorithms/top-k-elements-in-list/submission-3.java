class Solution {

    class Pair implements Comparable<Pair>{
        int element;
        int times;
        public Pair(int ele, int times){
            this.element = ele;
            this.times = times;
        }

        @Override
        public int compareTo(Pair p){
            return Integer.compare(p.times, this.times);
           
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int ele : nums){
            counter.put(ele, counter.getOrDefault(ele, 0)+1);
        }

        for(Map.Entry<Integer, Integer> it : counter.entrySet()){
            pq.add(new Pair(it.getKey(), it.getValue()));
        }

        int ans[] = new int[k];
        for(int i = 0; i< k; i++){
            ans[i] = pq.poll().element;
        }
        return ans;

    }
}
