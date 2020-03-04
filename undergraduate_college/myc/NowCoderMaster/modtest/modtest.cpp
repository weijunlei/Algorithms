#include <stdio.h>
#define MAX 10

/*
int nums1[MAX];
int nums2[MAX];

int main(){
    int a, b;
    while(scanf("%d %d", &a, &b)){
        int m = 0;
        int n = 0;
        int result = 0;
        while (a != 0){
            nums1[m++] = a % 10;
            a = a / 10;
        }
        while( b!= 0){
            nums2[n++] = b % 10;
            b = b / 10;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; i < n; j++){
                result += nums1[i] * nums2[j];
            }
        }
        printf("%d\n", result);
    }
}*/

// method2
char nums1[11];
char nums2[11];

int main(){
    while(scanf("%s %s", nums1, nums2)){
        int result = 0;
        for(int i = 0; nums1[i] != 0; i++){
            for(int j = 0; nums[j] != 0; j++){
                result += (nums1[i] - '0') * (nums2[j] - '0');
            }
        }
        printf("%d\n", result);
    }
}
