#include <stdio.h>

// 求最小公倍数
int main(){
    int a,b;
    while(scanf("%d %d", &a, &b)){
        int tempA = a;
        int tempB = b;
        while(tempB != 0){
            int temp = tempB;
            tempB = tempA % tempB;
            tempA = temp;
        }
        printf("%d\n", a * b / tempA);
    }
}
