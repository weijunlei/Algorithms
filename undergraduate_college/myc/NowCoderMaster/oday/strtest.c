#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int isAlpha(char ch){
    if ((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')){
        return 1;
    }
    else if (ch >= '0' && ch <= '9'){
        return 0;
    }else{
        return 3;
    }
}

int main(){
    char str1[100];
    char output[100];
    gets(str1);
    int strLength = strlen(str1);
    int notNullIndex = 0;
    while(str1[notNullIndex] == ' ' && notNullIndex < strLength){
        notNullIndex++;
    }
    int isFirst = 1;
    int outputIndex = 0;
    int frontAlpha = isAlpha(str1[0]);
    for(int i = notNullIndex;i < strLength; i++){
        if (isFirst == 1 || str1[i] != ' '){
            if (str1[i] == ' '){
                output[outputIndex++] = ' ';
            }
            else if (isAlpha(str1[i]) == frontAlpha || frontAlpha == 3 || isAlpha(str1[i]) == 3)
                output[outputIndex++] = str1[i];
            else{
                output[outputIndex++] = '_';
                output[outputIndex++] = str1[i];
            }
        }
        if (str1[i] == ' '){
            isFirst = 0;
            frontAlpha = 3;
        }else{
            isFirst = 1;
            frontAlpha = isAlpha(str1[i]);
        }
    }
    output[outputIndex] = 0;
    printf("%s", output);
}
