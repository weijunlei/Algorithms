package lc_179_largestNumber;

import java.util.Arrays;
import java.util.Comparator;

class Solution2 {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        String[] strNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
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
                    if (chA != chB){
                        return chB - chA;
                    }
                }
                return 0;
            }
        });
        if (strNums[0].equals("0")){
            return "0";
        }
        for(int i = 0; i < strNums.length; i++){
            result.append(strNums[i]);
        }
        return result.toString();
    }
}
