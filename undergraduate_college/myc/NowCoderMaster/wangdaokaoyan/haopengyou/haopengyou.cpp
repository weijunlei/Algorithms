#include <stdio.h>
#define N 10000001

int nums[N];
int sum[N];

int findRoot(int x){
    if (nums[x] == -1){
        return x;
    }
    else{
        int temp = findRoot(nums[x]);
        nums[x] = temp;
        return temp;
    }
}

int main(){
    int n;
    while(scanf("%d", &n)!= EOF){
        for(int i = 0; i < N; i++){
            nums[i] = -1;
            sum[i] = 1;
        }
        for(int i = 0; i < n; i++){
            int a, b;
            scanf("%d %d", &a, &b);
            a = findRoot(a);
            b = findRoot(b);
            if (a != b){
                nums[a] = b;
                sum[b] += sum[a];
            }
        }
        int ans = 1;
        for(int i = 0; i < N; i++){
            if (nums[i] == -1 && sum[i] >= ans){
                ans = sum[i];
            }
        }
        printf("%d\n", ans);
    }
}
