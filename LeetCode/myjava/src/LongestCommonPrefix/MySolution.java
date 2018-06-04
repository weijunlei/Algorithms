package LongestCommonPrefix;

public class MySolution {
    public String longgestCommprefix(String[] strs)
    {
        if (strs.length == 0)
            return "";

        String result = "";
        int max_result = strs[0].length();
        int min_index = 0;
        for (int i = 0; i < strs.length; i++)
            if (max_result > strs[i].length()) {
                max_result = strs[i].length();
                min_index = i;
            }
        for (int i = max_result; i >= 0; i--)
        {
            String temp_result = strs[min_index].substring(0, i);
            int sameSubNum = 0;
            for (int j = 0; j < strs.length; j ++)
            {
                String temp = strs[j].substring(0, i);
                if (temp_result != temp)
                    break;
                sameSubNum += 1;
            }
            if (sameSubNum == strs.length)
                return temp_result;
        }
        return result;
    }
}
