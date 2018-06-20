package reversesentence;

/**
 * @author : Qingfeng
 * @date : 2018/6/20
 */
public class Main {
    public static void main(String[] args) {
        String string = "student. a am I";
        ReverSesentence reverSesentence = new ReverSesentence();
        System.out.println(reverSesentence.reverseSentence(string));
    }
}
