package leftrotatestring;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class LeftRotateString {
    public String leftRorateString(String str, int n) {
        if (str == null || str.length() == 0 || n < 0) {
            return str;
        }

//        n = n % str.length();
//        String result = str + str;
//        return result.substring(n, n + str.length());

        n = n % str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        for(int i = 0; i < n; i++){
            sb.append(str.charAt(i));
        }

        return sb.toString();


    }
}
