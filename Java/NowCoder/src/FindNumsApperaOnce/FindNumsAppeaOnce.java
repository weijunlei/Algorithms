package FindNumsApperaOnce;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class FindNumsAppeaOnce {
    public void FindNumsAppearOnce(int[] array, int nums1[], int nums2[]){
        if (array == null || array.length == 0) {
            return;
        }

        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            result ^= array[i];
        }

        int firstOne = findFirstOne(result);
        int nums1Once = 0;
        int nums2Once = 0;

        for(int i : array) {
            if ((i >> firstOne & 1) == 1 ) {
                nums1Once ^= i;
            }
            else {
                nums2Once ^= i;
            }
        }

        nums1[0] = nums1Once;
        nums2[0] = nums2Once;

    }

    private int findFirstOne(int num){
        int count = 1;
        while ((num >> count & 1) != 1) {
            count ++;
        }
        return count;
    }
}
