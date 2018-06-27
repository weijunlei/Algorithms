package matrixchainorder;

/**
 * @author : Qingfeng
 * @date : 2018/6/27
 */
public class Main {
    public static void main(String[] args){
        MatrixChain matrixChain = new MatrixChain();
        int[] matrixList = {30, 35, 15, 5, 10, 20, 25};

        int[][] leastCostList = new int[matrixList.length][matrixList.length];
        int[][] kList = new int[matrixList.length][matrixList.length];

        matrixChain.matrixChain(matrixList, leastCostList, kList);

        for (int i = 1; i < matrixList.length; i++){
            for(int j = 0; j < matrixList.length; j++){
                System.out.format("%d\t" , leastCostList[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i < matrixList.length; i++){
            for(int j = 1; j < matrixList.length; j++){
                System.out.format("%d\t", kList[i][j]);
            }
            System.out.println();
        }

        PrintOptimalParens printOptimalParens = new PrintOptimalParens();
        printOptimalParens.printOptimalParens(kList, 1, 6);
    }
}
