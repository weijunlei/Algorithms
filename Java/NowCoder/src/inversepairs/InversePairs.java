package inversepairs;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class InversePairs {
    public int inversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        return mergePairs(array, 0, array.length - 1) % 1000000007;
    }

    private int mergePairs(int[] array, int startIndex, int endIndex) {
        if (endIndex > startIndex) {
            int midIndex = startIndex +(endIndex - startIndex) / 2;
            int leftPairs = mergePairs(array, startIndex, midIndex);
            int rightPairs = mergePairs(array, midIndex + 1, endIndex);
            int addNums = mergeSort(array, startIndex, midIndex, endIndex);

            return (leftPairs + rightPairs + addNums) % 1000000007;
        }

        return 0;
    }

    private int mergeSort(int[] array, int startIndex, int midIndex, int endIndex) {
        int[] sortArray = new int[endIndex - startIndex + 1];
        int result = 0;
        int leftIndex = startIndex;
        int rightIndex = midIndex + 1;
        int sortIndex = 0;

        while (leftIndex <= midIndex && rightIndex <= endIndex) {
            if (array[rightIndex] < array[leftIndex]) {
                result = (midIndex - leftIndex + 1) % 1000000007;
                sortArray[sortIndex] = array[rightIndex++];
            }
            else{
                sortArray[sortIndex] = array[leftIndex++];
            }
            sortIndex ++;
        }

        while (leftIndex <= midIndex)
        {
            sortArray[sortIndex++] = array[leftIndex++];
        }

        while (rightIndex <= endIndex) {
            sortArray[sortIndex++] = array[rightIndex++];
        }

        for (int i = startIndex; i <= endIndex; i++) {
            array[i] = sortArray[i - startIndex];
        }
//        System.out.println(result);
        return result;
    }
}
