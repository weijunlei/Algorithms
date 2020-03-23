package lc_387_firstUniqueChar;

class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0){
            return -1;
        }
        int[] chDict = new int[26];

        for(int i = 0; i < s.length(); i++){
            chDict[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < s.length(); i++){
            if(chDict[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
