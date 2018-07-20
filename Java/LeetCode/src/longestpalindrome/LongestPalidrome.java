package longestpalindrome;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author : Qingfeng
 * @date : 2018/7/19
 */
public class LongestPalidrome {
    public String longestPalindrome(String s){
        String result = "";
        if (s == null || s.length() == 0){
            return result;
        }

        int strLength = s.length();
        int spaceIndex = 2 * strLength;
        char[] chs = s.toCharArray();
        int getIndex = 0;
        int tempSize = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int maxSize = 0;
        System.out.println(strLength);
        for(int i = 1; i < spaceIndex; i++){
            tempSize = 0;
            if (i % 2 == 1){
                getIndex = i / 2;
                while(getIndex - tempSize + 1 >= 0 && getIndex + tempSize < strLength && getIndex - tempSize + 1 < strLength){
                    System.out.printf("%d: %d : %d\n",getIndex, getIndex - tempSize + 1, getIndex + tempSize);
                    if (chs[getIndex - tempSize + 1] == chs[getIndex + tempSize]){
                        tempSize++;
                    }
                    else {
                        break;
                    }
                }
                if (tempSize * 2 > maxSize){
                    maxSize = tempSize * 2;
                    leftIndex = getIndex - tempSize + 1;
                    rightIndex = getIndex + tempSize;
                }
            }
            else{
                getIndex = i / 2;
                while(getIndex - tempSize >= 0 && getIndex + tempSize < strLength){
                    if (chs[getIndex - tempSize] == chs[getIndex + tempSize]){
                        tempSize++;
                    }
                    else{
                        break;
                    }
                }
                if (tempSize * 2 + 1 > maxSize){
                    maxSize = tempSize * 2 + 1;
                    leftIndex = getIndex - tempSize;
                    rightIndex = getIndex + tempSize;
                }
            }
        }
        System.out.println(maxSize);
        System.out.println(leftIndex);
        System.out.println(rightIndex);
        return s.substring(leftIndex, rightIndex);
    }
}
