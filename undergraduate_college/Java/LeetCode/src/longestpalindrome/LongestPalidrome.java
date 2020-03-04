package longestpalindrome;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author : Qingfeng
 * @date : 2018/7/19
 */
public class LongestPalidrome {
    public String longestPalindrome(String s){
        if (s.isEmpty()){
            return null;
        }

        if (s.length() == 1){
            return s;
        }
        String result = "";
        int strLength = s.length();
        for(int i = 0; i < strLength; i++){
            String tempStr = centerGetter(s, i, i);
            if (tempStr.length() > result.length()){
                result = tempStr;
            }
            tempStr = centerGetter(s, i, i+1);
            if (tempStr.length() > result.length()){
                result = tempStr;
            }
        }
        return result;
    }

    public String centerGetter(String s, int begin, int end){
        while(begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        String tempStr = s.substring(begin + 1, end);
        return tempStr;
    }
}
