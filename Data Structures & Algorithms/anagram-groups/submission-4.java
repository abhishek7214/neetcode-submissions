class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       Map<String,List<String>> maping = new HashMap<>();
    
       for(String s : strs){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String key = new String(c);

        if(!maping.containsKey(key)){
            maping.put(key,new ArrayList<>());
        }

        maping.get(key).add(s);
       } 

       return new ArrayList<>(maping.values());

    }
}
