#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;
struct BigInteger{
    int val[1000];
    int valSize;

    void init(){
        valSize = 0;
        for(int i = 0; i < 1000; i++){
            val[i] = 0;
        }
    }

    void setting(char* str){
        init();
        int strLength = strlen(str);
        int tempNum = 0;
        int tempCount = 0;
        int tens = 1;
        for(int i = strLength - 1; i >= 0; i--){
            tempCount ++;
            tempNum += (str[i] - '0') * tens;
            tens *= 10;
            if (tempCount == 4 || i == 0){
                val[valSize++] = tempNum;
                tempNum = 0;
                tempCount = 0;
                tens = 1;
            }
        }
    }
}bigint[100];

bool cmp(BigInteger a, BigInteger b){
    if (a.valSize != b.valSize){
        return a.valSize < b.valSize;
    }
    else{
        for(int i = a.valSize - 1; i >= 0; i--){
            if (a.val[i] > b.val[i]){
                return false;
            }
            else if (a.val[i] < b.val[i]){
                return true;
            }
        }
        return true;
    }
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        char tempStr[1000];
        for(int i = 0; i < n; i++){
            scanf("%s", tempStr);
            bigint[i].setting(tempStr);
        }

       sort(bigint, bigint + n, cmp);
       for(int i = 0; i < n; i++){
            for(int j = bigint[i].valSize - 1; j >= 0; j--){
                    if (j != bigint[i].valSize - 1){
                        printf("%04d", bigint[i].val[j]);
                    }
                    else{
                        printf("%d", bigint[i].val[j]);
                    }
                }
                printf("\n");
        }
    }

    return 0;
}
