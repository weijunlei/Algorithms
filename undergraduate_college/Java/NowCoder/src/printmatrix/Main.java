package printmatrix;

/**
 * Author: FengQing
 * Email: qingfengwuyu233@gmail.com
 * Creation: 6/6/2018 3:31 PM
 **/

public class Main {
    public static  void main(String[] args) {
        int[][] myMatrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        PrintMatrix printMatrix = new PrintMatrix();
        System.out.println(printMatrix.printMatrix(myMatrix).toString());
    }
}
