package numberof1between1andn;

/**
 * @author : Qingfeng
 * @date : 2018/6/13
 */
public class NumberOf1Between1AndN {
    public int numberOf1Between1And(int n) {
        int result = 0;
        int current = 0;
        int before = 0;
        int after = 0;
        int tens = 1;

        while (n / tens > 0) {
            current = (n / tens) % 10;
            before = n / (tens * 10);
            after = n - (before + current) * 10;

            if (current == 0) {
                result += tens * before;
            }
            else if (current == 1) {
                result += tens * before + after + 1;
            }
            else {
                result += tens * (before + 1);
            }

            tens *= 10;
        }

        return result;
    }
}
