#include <stdio.h>
#include <string.h>

int main(){
    char str[20];
    while(scanf("%s", str)!= EOF){
        int strLength = strlen(str);
        int tempNum = 0;
        int numCount = 0;
        for(int i = 0; i < strLength; i++){
            //printf("%d:%c\n", i, str[i]);
            if (str[i] == '.' || i == strLength - 1){
                if (i == strLength - 1){
                    tempNum = tempNum * 10 + (str[i] - '0');
                }
                //printf("tempNum:%d\n", tempNum);
                if (tempNum >= 0 && tempNum <= 255){
                    //printf("%d:%d\n", i, tempNum);
                    numCount++;
                    tempNum = 0;
                }
                else{
                    break;
                }
            }
            else if (str[i] >= '0' && str[i] <= '9'){
                tempNum = tempNum * 10 + (str[i] - '0');
            }
            else{
                break;
            }
        }
        if (numCount == 4){
            printf("Yes!\n");
        }
        else{
            printf("No!\n");
        }
    }
}
