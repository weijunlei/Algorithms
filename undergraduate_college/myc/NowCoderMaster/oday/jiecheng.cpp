#include <stdio.h>

int factorial(int x){
    if (x == 0){
        return 0;
    }
    int result = 1;
    for(int i = 2; i <= x; i++){
        result *= i;
    }
    return result;
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        int result1 = 0;
        int result2 = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 == 1){
                result1 += factorial(i);
            }
            else{
                result2 += factorial(i);
            }
        }

        printf("%d %d\n", result1, result2);
    }
}
