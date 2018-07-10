#include <stdio.h>

// 最大公约数
int main(){
    int a, b;
    while(scanf("%d %d", &a, &b)){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        printf("%d\n", a);
    }
}
