#include <stdio.h>
#include <stdlib.h>

int main(){
    unsigned long int num, high, low, rol;
    int n, bit;
    printf("%x", &num);
    high = num >> 24;
    low = high << 24;
    num = num & 0x00ffff00;
    num = num | high;
    num = num | low;
    printf("%x\n", num);


}
