package reversepolishnotation;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 */
public class Main {
    public static void main(String[] args){
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        String[] strs = {"4", "13", "5", "/", "+"};
        System.out.println(reversePolishNotation.evalRPN(strs));
    }
}
