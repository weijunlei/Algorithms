package ZUglyNumber;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7)
            return index;
        int[] result = new int[index];
        int flagTwo = 0, flagThree = 0, flagFive = 0;
        result[0] = 1;
        for (int i = 1; i < index; i++)
        {
            result[i] = findThreeMin(2 * result[flagTwo], 3 * result[flagThree], 5 * result[flagFive]);
            if (result[i] == 2 * result[flagTwo]) flagTwo++;
            if (result[i] == 3 * result[flagThree]) flagThree++;
            if (result[i] == 5 * result[flagFive]) flagFive++;
        }
        return result[result.length - 1];
    }

    public int findThreeMin(int a, int b, int c)
    {
        int min = a < b ? a : b;
        min = min < c ? min : c;
        return min;
    }
}
