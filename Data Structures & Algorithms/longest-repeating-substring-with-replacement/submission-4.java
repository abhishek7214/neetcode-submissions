class Solution {
    public int characterReplacement(String s, int k) {
      Map<Character,Integer> map = new HashMap<>();
      int l = 0;
      int freq = 0;
      int res = 0;
      for(int i = 0 ; i < s.length() ; i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        freq = Math.max(freq,map.get(s.charAt(i)));

        if(i-l+1-freq > k){
            map.put(s.charAt(l),map.get(s.charAt(l))-1);
            l++;
        }

        res = Math.max(res, i-l+1);
      }

      return res;
    }
}
