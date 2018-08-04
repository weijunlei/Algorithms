#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int getNum(char* num){
    int strLength = strlen(num);
    int result = 0;
    for(int i = 0; i < strLength; i++){
        result = result * 2 + num[i] - '0';
    }
    return result;
}

void printBinary(int num){
    int temp = num;
    do{
        printf("oringin: %d\n", num);
        printf("%d", num % 2);
        num /= 2;
    }while(num != 0);
}

int main(){
    char str1[100];
    char str2[100];
    char ch;
    while(scanf("%s%s %c", str1, str2, &ch)){
        int num1 = getNum(str1);
        int num2 = getNum(str2);
        printf("Oringin num: %d %d %c \n", num1, num2, ch);
        switch (ch){
        case '+':
            printf("Hello World\n");
            printBinary(num1 + num2);
            break;
        case '-':
            printBinary(num1 - num2);
            break;
        case '*':
            printBinary(num1 * num2);
            break;
        case '/':
            printBinary(num1 / num2);
            break;
        }
    }

    return 0;
}
