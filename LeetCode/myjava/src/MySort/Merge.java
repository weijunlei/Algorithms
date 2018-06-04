package MySort;

import sun.security.util.Length;

public class Merge {
    public static void Merge(int[] arr, int left, int mid, int right)
    {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int index = 0;
        while (i <= mid && j <= right)
        {
            if (arr[i] <= arr[j])
                temp[index++] = arr[i++];
            else
                temp[index++] = arr[j++];
        }
        while (i <= mid)
            temp[index++] = arr[i++];
        while (j <= right)
            temp[index++] = arr[j++];
        for(i = 0; i < temp.length; i++)
            arr[left++] = temp[i];
    }
}
