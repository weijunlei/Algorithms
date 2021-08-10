package lc_all_sort;



public class Main {
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {5,4,3,2,1};
        bubbleSort.bubbleSort2(nums);
        for(int num: nums){
            System.out.println(num);
        }
    }
}
