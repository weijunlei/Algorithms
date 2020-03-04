#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
    char str1[100];
    scanf("%s", str1);
    printf("%d\n", strlen(str1));
    int strLength = strlen(str1);
    str1[strLength] = ',';
    str1[strLength + 1] = 0;
    printf("%d\n", strlen(str1));
    return 0;
}
