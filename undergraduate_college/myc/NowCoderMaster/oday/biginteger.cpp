#include <stdio.h>
#include <string.h>

struct BigInteger{
    int value[1000];
    int valueSize;

    void init(){
        valueSize = 0;
        for(int i = 0; i < 1000; i++){
            value[i] = 0;
        }
    }

    void setting(char* nums){
        init();
        int strLength = strlen(nums);
        int numsCount = 0;
        int tens = 1;
        int tempNum = 0;
        for(int i = strLength - 1; i >= 0; i--){
            tempNum += tens * (nums[i] - '0');
            tens *= 10;
            numsCount ++;
            if (numsCount == 4 || i == 0){
                numsCount = 0;
                value[valueSize++] = tempNum;
                tempNum = 0;
                tens = 1;
            }
        }
    }

        BigInteger operator +(const BigInteger &A){
            BigInteger result;
            result.init();
            //printf("init :%d\n", result.valueSize);
            int carry = 0;
            for(int i = 0; i < A.valueSize || i < valueSize; i++){
                int tmp = A.value[i] + value[i] + carry;
                carry = tmp / 10000;
                tmp %= 10000;
                result.value[result.valueSize++] = tmp;
            }
            if (carry != 0){
                result.value[result.valueSize++] = carry;
            }
            //printf("init : %d\n", result.valueSize);
            return result;
        }
}a, b, c;

char str1[1001];
char str2[1001];

int main(){
    while(scanf("%s%s", str1, str2) != EOF){
        //printf("Hello World1\n");
        a.setting(str1);
        //printf("Hello World2\n");
        b.setting(str2);
        //printf("%d %d\n", a.valueSize, b.valueSize);
        c = a + b;
        //printf("c value : %d\n", c.valueSize);
        for(int i = c.valueSize; i > 0; i--){
            if ( i != c.valueSize){
                printf("%04d", c.value[i - 1]);
            }
            else{
                printf("%d", c.value[i - 1]);
            }
        }
        printf("\n");
    }
}
