package generateparenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 * 题目：生成括号
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/49/backtracking/92/
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        if (n == 0){
            return result;
        }
        StringBuilder sb = new StringBuilder();
        generateParenthesisHelper(result, n, n, sb);

        return result;
    }

    private void generateParenthesisHelper(List<String> result, int leftNum, int rightNum, StringBuilder sb){
        // 关键步骤在生成括号方案时右括号必须小于左括号
        if (leftNum > rightNum) {
            return;
        }
        if (leftNum == 0 && rightNum == 0){
            result.add((new StringBuilder(sb)).toString());
        }

        // 回溯
        if (leftNum > 0){
            generateParenthesisHelper(result, leftNum - 1 , rightNum, sb.append('('));
            sb.deleteCharAt(sb.length() - 1);
        }
        if (rightNum > 0){
            generateParenthesisHelper(result, leftNum, rightNum - 1, sb.append(')'));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
