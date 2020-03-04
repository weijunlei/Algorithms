package isnumeric;

/**
 * @author : Qingfeng
 * @date : 2018/6/30
 */
public class Main {
    public static void main(String[] args){
        IsNumeric isNumeric = new IsNumeric();
        String str = "12-";
        System.out.println(isNumeric.isNumeric(str.toCharArray()));
    }
}
