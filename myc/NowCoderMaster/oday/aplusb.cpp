#include <stdio.h>
#include <string.h>

int main(){
    char str1[100];
    char str2[100];
    while(scanf("%s%s", str1, str2) != EOF){
        int strLength1 = strlen(str1);
        int strLength2 = strlen(str2);
        int tempNum1 = 0;
        int tempNum2 = 0;
        bool isNeg = false;
        for(int i = 0; i < strLength1; i++){
            if (i == 0 && str1[i] == '-'){
                isNeg = true;
            }
            else{
                if (str1[i] != ',')
                    tempNum1 = tempNum1 * 10 + str1[i] - '0';
            }
        }
        if (isNeg){
            tempNum1 = -tempNum1;
            isNeg = false;
        }
        for(int i = 0; i < strLength2; i++){
            if (i == 0 && str2[i] == '-'){
                isNeg = true;
            }
            else{
                if (str2[i] != ','){
                    tempNum2 = tempNum2 * 10 + str2[i] - '0';
                }
            }
        }
        if (isNeg){
            tempNum2 = -tempNum2;
            isNeg = false;
        }

        printf("%d\n", tempNum1 + tempNum2);
    }
    return 0;
}
