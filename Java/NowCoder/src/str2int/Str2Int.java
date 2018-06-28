package str2int;

/**
 * @author : Qingfeng
 * @date : 2018/6/28
 */
public class Str2Int {
    public int str2Int(String str){
        if (str == null || str.length() == 0){
            return 0;
        }

        int result = 0;
        int hasCorrectSymble = 0;
        if (str.charAt(0) == '+' || str.charAt(0) == '-'){
            if (str.charAt(0) == '+'){
                hasCorrectSymble = 1;
            }
            if (str.charAt(0) == '-'){
                hasCorrectSymble = 2;
            }
        }

        for(int i = 0; i < str.length(); i++){
            if (i == 0 && hasCorrectSymble != 0){
                continue;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                result = result * 10 + str.charAt(i) - '0';
            }
            else {
                return 0;
            }
        }

        return hasCorrectSymble == 2 ? -result : result;
    }
}
