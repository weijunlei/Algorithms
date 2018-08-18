package generateparenthesis;

import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 */
public class Main {
    public static void main(String[] args){
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> result = generateParenthesis.generateParenthesis(3);
        System.out.println(result.size());
        for (String str : result){
            System.out.println(str);
        }
    }
}
