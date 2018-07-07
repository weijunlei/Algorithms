#include<stdio.h>

int main(){
    int h;
    if (scanf("%d", &h)){
        int lineCount = h + (h - 1) * 2;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= lineCount; j++){
                if (j < lineCount - h - (i - 1) * 2 + 1){
                    printf(" ");
                }
                else{
                    printf("*");
                }
            }
            printf("\n");
        }
    }

    return 0;
}
