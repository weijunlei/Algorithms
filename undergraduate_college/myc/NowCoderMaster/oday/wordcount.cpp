#include <stdio.h>
#include <string.h>

int main(){
    int wordCount[123];
    char str[100];
    while(scanf("%s", str) != EOF){
        for(int i = 0; i < 123; i++){
            wordCount[i] = 0;
        }
        int strLength = strlen(str);
        for(int i = 0; i < strLength; i++){
            wordCount[(int)str[i]] ++;
        }


        for(int i = 0; i < strLength; i++){
            if (wordCount[int(str[i])] > 1){
                for(int j = i; j < strLength; j++){
                    if (str[j] == str[i]){
                        printf("%c:%d", str[j], j);
                        wordCount[int(str[i])] --;
                        if (wordCount[int(str[i])] != 0){
                            printf(",");
                        }
                    }
                }
                printf("\n");
            }
        }
    }
    return 0;
}
