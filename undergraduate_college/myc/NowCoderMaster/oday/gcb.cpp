#include <stdio.h>

int main(){
    int a, b;
    while(scanf("%d%d", &a, &b) != EOF){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        printf("%d\n", a);
    }
}
