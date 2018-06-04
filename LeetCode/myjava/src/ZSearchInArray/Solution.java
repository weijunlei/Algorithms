package ZSearchInArray;

public class Solution {
    public boolean Find(int target, int[][] array) {
        if (array == null || array[0].length == 0)
            return false;

        boolean isFind = false;
        int rowNum = array.length;
        int colNum = array[0].length;
        int tempValue = 0;
        int row = 0;
        int column = colNum - 1;
        while (row < rowNum && column < colNum)
        {
            tempValue = array[row][column];
            if (target > tempValue)
                row ++;
            else if(target < tempValue)
                    row --;
            else
            {
                isFind = true;
                break;
            }
        }

        return isFind;
    }
}
