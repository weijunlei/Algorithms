package mediumofdata;

/**
 * @author : Qingfeng
 * @date : 2018/7/6
 */
public class Main {
    public static void main(String[] args){
        MediumOfData mediumOfData = new MediumOfData();
        int[] nums = {5,7, 9, 4, 3, 6, 11, 13 ,15};
        for(int i = 0; i < nums.length; i ++){
            mediumOfData.dataStream.add(nums[i]);
        }

        System.out.println(mediumOfData.dataStream.toString());
        double result = mediumOfData.getMedian();
        System.out.println(result);
        System.out.printf("%.2f", result);
    }
}
