#include <stdio.h>

int nums[100][100];

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                scanf("%d", &nums[i][j]);
            }
        }
        int isSymmetry = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if (nums[i][j] != nums[j][i]){
                    isSymmetry = 0;
                    break;
                }
            }
            if (isSymmetry == 0)
                break;
        }

        if (isSymmetry == 1){
            printf("Yes!\n");
        }
        else{
            printf("No!\n");
        }
    }
    return 0;
}
