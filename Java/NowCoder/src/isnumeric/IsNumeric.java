package isnumeric;

/**
 * @author : Qingfeng
 * @date : 2018/6/30
 */
public class IsNumeric {
    public boolean isNumeric(char[] str){
        if (str == null || str.length == 0){
            return false;
        }
        boolean judgeE = false;
        boolean judgeNegetive = false;

        for(int i = 0; i < str.length; i++){
            if (str[i] < '9' && str[i] > '0'){
                continue;
            }

            if(str[i] == '+' || str[i] == '-'){
                if (judgeNegetive || i == str.length - 1){
                    return false;
                }
                else {
                    judgeNegetive = true;
                }
            }

            if (str[i] == 'E' || str[i] == 'e'){
                if (judgeE || i == str.length - 1){
                    return false;
                }
                else{
                    judgeE = true;
                    judgeNegetive = false;
                }
            }

        }

        return true;
    }
}
