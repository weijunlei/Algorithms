#include <stdio.h>

int main(){
    int n;
    char writenLine[101];
    char result[103];
    if (scanf("%d\n", &n)!= EOF){ // 去除缓冲区多余字符
        while(gets(writenLine)){
            if (writenLine[0] == 0){
                break;
            }
            int leftBegin = -1;
            int leftEnd = -1;
            int middle = -1;

            for(int i = 0; writenLine[i] != 0; i++){
                char ch = writenLine[i];
                if (ch == ':'){
                    middle = i;
                    break;
                }
                if (leftBegin == -1 && ch != ' ' && ch != '\t'){
                    leftBegin = i;
                    leftEnd = i;
                }
                if(leftEnd != -1 && ch != ' ' && ch != '\t'){
                    leftEnd = i;
                }
            }

            int lastSpaceIndex = n - leftEnd + leftBegin - 3;
            for(int i = 0; i <= lastSpaceIndex; i++){
                result[i] = ' ';
            }
            for(int i = 0; i < leftEnd - leftBegin + 1; i++){
                result[i + lastSpaceIndex] = writenLine[leftBegin + i];
            }
            int resultIndex = n + 1;
            for(int i = middle + 1; writenLine[i] != 0; i++){
                if (writenLine[i] != ' ' && writenLine[i] != '\t'){
                    result[resultIndex++] = writenLine[i];
                }
            }
            result[n - 1] = ':';
            result[n - 2] = result[n] = ' ';
            result[resultIndex] = 0;
            printf("%s\n", result);

        }
    }
    return 0;
}
