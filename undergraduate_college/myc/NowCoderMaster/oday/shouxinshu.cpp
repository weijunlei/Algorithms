#include <stdio.h>

int main(){
    int a;
    while(scanf("%d", &a) != EOF){
        int b = a * a;
        bool canJudge = 0;
        while(a != 0){
            if (a % 10 == b % 10){
                a /= 10;
                b /= 10;
            }
            else{
                canJudge = 1;
                break;
            }
        }
        if (canJudge == 0){
            printf("Yes!\n");
        }
        else{
            printf("No!\n");
        }
    }
    return 0;
}
