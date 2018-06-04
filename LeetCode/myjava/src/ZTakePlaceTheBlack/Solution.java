package ZTakePlaceTheBlack;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        if (str == null)
            return null;
        int spaceNum = 0;
        int oldIndex = 0;
        int oldLength = str.length();
        for (int i=0; i < oldLength; i++)
            if (str.charAt(i) == ' ')
                spaceNum += 1;
        if (spaceNum == 0)
            return str.toString();

        int newIndex = str.length() + 2 * spaceNum - 1;
        str.setLength(newIndex + 1);

        for (int i = oldIndex - 1; i >= 0; i--)
        {
            if (str.charAt(i) == ' ')
            {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            }
            else
                str.setCharAt(newIndex--, str.charAt(i));
        }

        return str.toString();
    }
}
