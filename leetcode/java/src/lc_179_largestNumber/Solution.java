package lc_179_largestNumber;

class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        String[] strNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strNums[i] = String.valueOf(nums[i]);
        }
        quickSort(strNums, 0, strNums.length - 1);
        if (strNums[0].equals("0")){
            return "0";
        }
        for(int i = 0; i < strNums.length; i++){
            result.append(strNums[i]);
        }
        return result.toString();
    }

    private void quickSort(String[] nums, int start, int end){
        if (start < end){
            int getIndex = getPartition(nums, start, end);
            quickSort(nums, start, getIndex);
            quickSort(nums, getIndex + 1, end);
        }
    }

    private int getPartition(String[] nums, int start, int end){
        String getNum = nums[start];
        nums[start] = nums[end];
        nums[end] = getNum;
        int getIndex = start;
        for(int i = start; i < end; i++){
            if (compare(nums[i], getNum)){
                String temp = nums[getIndex];
                nums[getIndex] = nums[i];
                nums[i] = temp;
                getIndex ++;
            }
        }
        nums[end] = nums[getIndex];
        nums[getIndex] = getNum;
        return getIndex;
    }

    private boolean compare(String a, String b){
        int aCount = a.length();
        int bCount = b.length();
        int maxCount = aCount > bCount ? aCount : bCount;
        char chA = '0';
        char chB = '0';
        for(int i = 0; i < aCount + bCount; i++){
            if (i < aCount){
                chA = a.charAt(i);
            }else{
                chA = b.charAt(i - aCount);
            }
            if(i < bCount){
                chB = b.charAt(i);
            }else{
                chB = a.charAt(i - bCount);
            }
            if (chA > chB){
                return true;
            }else if(chA < chB){
                return false;
            }
        }
        return false;
    }
}
