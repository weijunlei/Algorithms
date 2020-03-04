#include <stdio.h>
#include <string.h>

struct bigInteger{
    int digit[1000];
    int size;

    //初始化函数
    void init(){
        for(int i = 0; i < 1000; i++){
            digit[i] = 0;
        }
        size = 0;
    }

    void set(char str[]){ //从字符串提取整数
        init();
        int strLength = strlen(str);

        int getFour = 0;
        int temp = 0;
        int tens = 1;
        for(int i = strLength - 1; i >= 0; i--){
            temp += (str[i] - '0') * tens;
            getFour ++;
            tens *= 10;

            if (getFour == 4 || i == 0){
                digit[size++] = temp;

                getFour = 0;
                temp = 0;
                tens = 1;
            }
        }
    }

    void output(){
        for(int i = size - 1; i >= 0; i--){
            if (i != size - 1){
                printf("%04d", digit[i]);
            }
            else{
                printf("%d", digit[i]);
            }
        }
        printf("\n");
    }

    bigInteger operator +(const bigInteger &A) const{
        bigInteger result;
        result.init();
        int carry = 0;
        for(int i = 0; i < A.size || i < size; i++){
            int temp = A.digit[i] + digit[i] + carry;
            carry = temp / 10000;
            temp %= 10000;
            result.digit[result.size++] = temp;
        }
        if (carry != 0){
            result.digit[result.size++] = carry;
        }
        return result;
    }
}a, b , c;

char str1[1002], str2[1002];

int main(){
    while(scanf("%s%s", str1, str2) != EOF){
        a.set(str1);
        b.set(str2);
        c = a + b;
        c.output();
    }

    return 0;
}
