package reversesentence;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class ReverSesentence {
    public String reverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        String[] strings = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = strings.length - 1; i >= 0; i--) {
            stringBuilder.append(strings[i]);
            if (i != 0) {
                stringBuilder.append(' ');
            }
        }

        return stringBuilder.toString();
    }
}
