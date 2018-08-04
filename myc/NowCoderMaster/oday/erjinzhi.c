#include <stdio.h>
#include <stdlib.h>

void printBinary(int x){
    if (x != 0){
        printBinary(x / 2);
    }else{
        return;
    }
    printf("%d", x % 2);
}

int main(){
    int n;
    while(scanf("%d", &n)){
        if (n != 0)
            printBinary(n);
        else
            printf("0");
        printf("\n");
    }
    return 0;
}
