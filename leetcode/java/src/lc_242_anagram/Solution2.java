package lc_242_anagram;

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if ((s == null && t != null) || (s != null && t == null) || s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i < s.length(); i++){
            count[s.charAt(i) - 'a'] += 1;
            count[t.charAt(i) - 'a'] -= 1;
        }
        for(int i=0; i < 26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
