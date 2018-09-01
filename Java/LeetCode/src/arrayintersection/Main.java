package arrayintersection;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 */
public class Main {
    public static void main(String[] args){
        ArrayIntersect arrayIntersect = new ArrayIntersect();
        BetterArrayIntersection betterArrayIntersection = new BetterArrayIntersection();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

//        int[] result = arrayIntersect.intersect(nums1, nums2);
        int[] result = betterArrayIntersection.intersection(nums1, nums2);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
