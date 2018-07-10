#include<stdio.h>
#include<string.h>
char a[100];

bool isPalindrome(){
    int strLength = strlen(a);
    int halfIndex = strLength / 2 - 1;
    bool isPalinme = true;
    for(int i = 0; i <= halfIndex; i ++){
        if (a[i] != a[strLength - 1 - i]){
            isPalinme = false;
            break;
        }
    }

    return isPalinme;
}

void reverseCopy(char* sumNum){
    int bLength = strlen(sumNum);
    for(int i = 0; i < bLength; i++){
        a[i] = sumNum[bLength - 1 - i];
    }
    a[bLength] = 0;
}

int main(){
    while(scanf("%s", a)){
        while(!isPalindrome()){
            char addedNum[100];
            char sumNum[100];
            int strLength = strlen(a);
            for(int i = 0; i < strLength; i++){
                addedNum[i] = a[strLength - 1 - i];
            }
            addedNum[strLength] = 0;
            //printf("%s+%s=", a, addedNum);
            int carry = 0;
            for(int i = 0; i < strLength; i++){
                int temp = (a[i] - '0') + (addedNum[i] - '0') + carry;
                carry = temp / 10;
                temp %= 10;
                sumNum[i] = temp + '0';
            }
            if (carry == 1){
                sumNum[strLength] = '1';
                sumNum[strLength + 1] = 0;
            }
            else{
                sumNum[strLength] = 0;
            }
            printf("%s+%s=", a, addedNum);
            reverseCopy(sumNum);
            printf("%s\n", a);
        }
        printf("回文数为:%s\n", a);
    }
}
