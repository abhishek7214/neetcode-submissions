class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] fre = new List[nums.length + 1];

        for(int i = 0; i < fre.length ; i++){
            fre[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < nums.length ; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            fre[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int c = 0;
        for(int i = fre.length - 1; i >= 0 ; i --){
            for(int j : fre[i]){
                if(c == k){
                     return res;
                }
                res[c] = j;
                c++;
            }
        }

        return res;
    }
}
