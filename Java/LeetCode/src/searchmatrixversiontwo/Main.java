package searchmatrixversiontwo;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class Main {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,6,8},{2,4,7,9,10}};
        SearchMatrix searchMatrix = new SearchMatrix();
        System.out.println(searchMatrix.searchMatrix(matrix, 100));
    }
}
