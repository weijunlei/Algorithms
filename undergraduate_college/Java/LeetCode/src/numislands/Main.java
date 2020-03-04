package numislands;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 * 题目：岛屿的个数
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/32/trees-and-graphs/90/
 */
public class Main {
    public static void main(String[] args){
        NumIslands numIslands = new NumIslands();
        char[][] grid  = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        System.out.println(numIslands.numIslands(grid));
    }
}
