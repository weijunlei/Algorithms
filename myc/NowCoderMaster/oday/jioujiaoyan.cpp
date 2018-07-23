#include <stdio.h>

int main(){
    char a[100];
    int b[8], i;
    while(scanf("%s", a) != EOF){
        int sum = 0;
        int c = 0;
        //printf("Hello World1\n");
        while(a[c] != '\0'){
            //printf("Hello World2\n");
            sum = 0;
            for(i = 7; i >= 1; i--){
                //printf("%d\n", a[c]);
                b[i] = a[c] % 2;
                a[c] = a[c] / 2;
            }

            for(i = 1; i <= 7; i++){
                sum += b[i];
            }
            if (sum % 2 == 0) b[0] = 1;
            else b[0] = 0;
            for(i = 0; i < 8; i++){
                printf("%d", b[i]);
            }
            c++;
            printf("\n");
        }
    }
    return 0;
}
