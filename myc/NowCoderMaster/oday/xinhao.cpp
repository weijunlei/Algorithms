#include <stdio.h>

int main(){
    int h;
    while(scanf("%d", &h) != EOF){
        int maxLength  = h + (h - 1) * 2;
        for(int i = 0; i < h; i ++){
            for(int j = 0; j < maxLength; j++){
                if (j < (h - 1 - i) * 2){
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
