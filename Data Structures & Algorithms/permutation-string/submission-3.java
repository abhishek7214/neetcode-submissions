class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int[] s1c = new int[26];
        int[] s2c = new int[26];
        for(int i = 0 ; i < s1.length() ; i++){
            s1c[s1.charAt(i) - 'a']++;
            s2c[s2.charAt(i) - 'a']++;
        }

        int match = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(s1c[i] == s2c[i]){
                match++;
            }
        }

        int l =0;
        for(int i = s1.length() ; i < s2.length() ; i++){

            if(match == 26){
                return true;
            }

            int index = s2.charAt(i) - 'a';
            s2c[index]++;
            if(s1c[index] == s2c[index]){
                match++;
            }else if( s1c[index] + 1 == s2c[index]){
                match--;
            }

            index = s2.charAt(l) - 'a';
            s2c[index]--;
            if(s1c[index] == s2c[index]){
                match++;
            }else if( s1c[index] - 1 == s2c[index]){
                match--;
            }
            l++;

        }

        return match == 26;
    }
}
