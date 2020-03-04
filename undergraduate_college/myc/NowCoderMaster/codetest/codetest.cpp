#include <stdio.h>

int myPow(int m, int n){
    int result  = 1;
    for(int i = 1; i <= n; i++ ){
        result *= m;
    }
    return result;
}

int main(){
    int m, a, b;
    while(scanf("%d %d %d", &m, &a, &b)){
        int addNum = a + b;
        int numCount = 0;
        while(addNum != 0){
            addNum /= m;
            numCount ++;
        }
        addNum = a+b;
        for(int i = numCount - 1; i >= 0; i--){
            int temp = addNum / myPow(m, i);
            addNum -= temp * myPow(m, i);
            printf("%d", temp);
        }
        printf("\n");
    }
}
