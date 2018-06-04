package ZigZagConversion;

/**
 * Created by IntelliJ IDEA
 * User: lei11
 * Date: 2018/1/24
 * TIME: 23:35
 * PROJECTNAME: myjava
 **/
public class Mysolution {
    public String convert(String s, int numRows)
    {
        if (s == null || s.length() == 0 || numRows <= 0)
            return null;
        if (numRows == 1)
            return s;

        StringBuilder result = new StringBuilder();
        int size = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++)
        {
            for (int j = i; j < s.length(); j += size) {
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1)
                {
                    int temp = j + size - 2 * i;
                    if (temp < s.length())
                        result.append(s.charAt(temp));
                }

            }
        }
        return result.toString();
    }
}
