import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0)
            return "";
        int numsLength = numbers.length;
        String[] str = new String[numsLength];
        StringBuilder result = new StringBuilder();
        for(int i=0; i < numsLength; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });

        for (int i = 0; i < numsLength; i++){
            result.append(str[i]);
        }
        return result.toString();
    }
}