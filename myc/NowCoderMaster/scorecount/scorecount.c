#include <stdio.h>

int main(){
    int n;
    while(scanf("%d", &n) != EOF && n != 0){
        int nums[101];
        for(int i = 0; i <= 100; i ++){
            nums[i] = 0;
        }
        for(int i = 0; i < n; i++){
            int temp = 0;
            scanf("%d", &temp);
            nums[temp] ++;
        }
        int hashNum = 0;
        scanf("%d", &hashNum);
        printf("%d\n", nums[hashNum]);
    }
    return 0;
}
