package ZGetLeastNumbersSolution;

import java.util.ArrayList;

public class SolutionTwo {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (input == null || input.length == 0 || k > input.length || k <= 0)
            return result;

        int startIndex = 0;
        int endIndex = input.length - 1;
        int pivot = Partition(input, startIndex, endIndex);

        while(pivot != k-1)
        {
            if (pivot > k-1)
            {
                endIndex = pivot - 1;
                pivot = Partition(input, startIndex, endIndex);
            }
            else
            {
                startIndex = pivot + 1;
                pivot = Partition(input, startIndex, endIndex);
            }
        }

        for (int i = 0; i < k; i++)
            result.add(input[i]);
        return result;
    }

    public int Partition(int[] input, int startIndex, int endIndex){
        int pivot = startIndex + (int) (Math.random() * (endIndex - startIndex + 1));

        int temp = input[pivot];
        int exchangeIndex = startIndex - 1;
        input[pivot] = input[endIndex];
        input[endIndex] = temp;

        for(pivot = startIndex; pivot < endIndex; pivot ++)
        {
            if (input[pivot] < input[endIndex])
            {
                exchangeIndex ++;
                if (exchangeIndex != pivot)
                {
                    temp = input[pivot];
                    input[pivot] = input[exchangeIndex];
                    input[exchangeIndex] = temp;
                }
            }
        }
        exchangeIndex ++;
        temp = input[exchangeIndex];
        input[exchangeIndex] = input[endIndex];
        input[endIndex] = temp;

        return exchangeIndex;
    }
}

