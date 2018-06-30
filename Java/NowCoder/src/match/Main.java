package match;

/**
 * @author : Qingfeng
 * @date : 2018/6/30
 */
public class Main {
    public static void main(String[] args){
        String str = "aaa";
        String pattern = "ab*ac*a";
        Match match = new Match();
        System.out.println(match.match(str.toCharArray(), pattern.toCharArray()));
    }
}
