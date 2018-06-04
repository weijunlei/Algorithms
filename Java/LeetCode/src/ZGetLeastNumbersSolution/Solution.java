package ZGetLeastNumbersSolution;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || k > input.length)
            return result;

        QuickSort(input, 0, input.length - 1);
        for(int i = 0; i < k; i ++)
            result.add(input[i]);
        return result;

    }

    private void Swap(int[] input, int i, int j)
    {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    private int Partition(int[] input, int start, int end)
    {
        int tempNum = input[end];
        int pivotyIndex = start;
        for (int i = start; i <= end; i++  )
        {
            if (input[i] < tempNum)
            {
                Swap(input, pivotyIndex++, i);
            }
        }
        Swap(input, pivotyIndex, end);

        return pivotyIndex;
    }

    public void QuickSort(int[] input, int start, int end)
    {
        if (start < end)
        {
            int pivotyIndex = Partition(input, start, end);
            QuickSort(input, start, pivotyIndex - 1);
            QuickSort(input, pivotyIndex + 1, end);
        }
    }
}