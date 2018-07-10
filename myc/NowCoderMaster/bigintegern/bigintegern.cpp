#include <stdio.h>

struct bigInteger{
    int digit[1000];
    int size;

    void init(){
        for(int i = 0; i < 1000; i++){
            digit[i] = 0;
        }
        size = 0;
    }

    void set(int x){
        init();
        do{
            int temp = x % 1000;
            x /= 1000;
            digit[size++] = temp;
        }while(x != 0);
    }

    void output(){
        for(int i = size - 1; i >= 0; i--){
            if (i == size - 1){
                printf("%d", digit[i]);
            }
            else{
                printf("%04d", digit[i]);
            }
        }
        printf("\n");
    }

    bigInteger operator *(int x) const{
        bigInteger result;
        result.init();
        int carry = 0;
        for(int i = 0; i < size; i ++){
            int temp = digit[i] * x + carry;
            carry = temp / 1000;
            temp %= 1000;
            result.digit[result.size++] = temp;
        }
        if (carry != 0){
            result.digit[result.size++] = carry;
        }
        return result;
    }
}a;

int main(){
    int n;
    while(scanf("%d", &n)){
        a.set(n);
        for(int i = n - 1; i > 1; i--){
            a = a * i;
        }
        a.output();
    }
    return 0;
}
