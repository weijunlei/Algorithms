package match;

/**
 * @author : Qingfeng
 * @date : 2018/6/29
 */
public class Match {
    public boolean match(char[] str, char[] pattern){
        if (str == null || str.length == 0 || pattern.length == 0){
            return false;
        }

        return matchHelper(str, pattern, 0, 0);
    }

    private boolean matchHelper(char[] str, char[] pattern, int strIndex, int patternIndex){
        if (strIndex == str.length && pattern.length == patternIndex){
            return true;
        }

        if (strIndex != str.length && pattern.length == patternIndex){
            return false;
        }

        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*'){
            if (strIndex != str.length && (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.')){
                return matchHelper(str, pattern, strIndex, patternIndex + 2) || matchHelper(str, pattern, strIndex + 1, patternIndex+2) || matchHelper(str, pattern, strIndex + 1, patternIndex);
            }
            else{
                return matchHelper(str, pattern, strIndex, patternIndex + 2);
            }
        }

        if (strIndex != str.length && (pattern[patternIndex] == str[strIndex] || pattern[patternIndex] == '.')){
            return matchHelper(str, pattern, strIndex + 1, patternIndex +1);
        }

        return false;
    }
}
