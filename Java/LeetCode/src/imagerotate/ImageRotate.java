package imagerotate;

/**
 * @author : Qingfeng
 * @date : 2018/9/1
 * 旋转图像
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 */
public class ImageRotate {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        for(int i = 0; i < matrix.length; i++){
            // 先转置再镜像反转
            for(int j = i + 1; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            reverse(matrix[i]);
        }
    }

    private void reverse(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while (right > left){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right --;
            left ++;
        }
    }
}
