package FindNumsApperaOnce;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class Main {
    public static void main(String[] args) {
        ComplexFindNumsAppearOnce complexFindNumsAppearOnce = new ComplexFindNumsAppearOnce();
        FindNumsAppeaOnce findNumsAppeaOnce = new FindNumsAppeaOnce();
        int[] nums = {1,2,3,4,5,6,4,3,2,1};
        int[] nums1 = {1};
        int[] nums2 = {2};

        findNumsAppeaOnce.FindNumsAppearOnce(nums, nums1, nums2);
//        complexFindNumsAppearOnce.findNumsAppearOnce(nums, nums1, nums2);

        System.out.println(nums1[0]);
        System.out.println(nums2[0]);
    }
}
