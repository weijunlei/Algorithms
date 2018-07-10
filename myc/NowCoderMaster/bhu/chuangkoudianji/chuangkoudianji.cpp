#include <stdio.h>

struct Windows{
    int lable;
    int a;
    int b;
    int c;
    int d;
}win[10];

void swap(int i, int j){
    int tempLable = win[i].lable;
    int tempA = win[i].a;
    int tempB = win[i].b;
    int tempC = win[i].c;
    int tempD = win[i].d;
    win[i].lable = win[j].lable;
    win[i].a = win[j].a;
    win[i].b = win[j].b;
    win[i].c = win[j].c;
    win[i].d = win[j].d;
    win[j].lable = tempLable;
    win[j].a = tempA;
    win[j].b = tempB;
    win[j].c = tempC;
    win[j].d = tempD;
}

int isInScope(int posX, int posY, int index){
    if (posX >= win[index].a && posX <= win[index].c && posY >= win[index].b && posY <= win[index].d){
        //printf("%d %d %d %d %d %d\n", posX, posY, win[index].a, win[index].c, win[index].b, win[index].d);
        return 1;
    }
    else{
        //printf("%d %d %d %d %d %d\n", posX, posY, win[index].a, win[index].c, win[index].b, win[index].d);
        return 0;
    }
}

int main(){
    int m, n;
    int nPos[20][2];
    while(scanf("%d", &m)){
        for(int i = 0; i < m; i++){
            scanf("%d %d %d %d %d", &win[i].lable, &win[i].a, &win[i].b, &win[i].c, &win[i].d);
        }
        if (scanf("%d", &n)){
            for(int i = 0; i < n;i++){
                scanf("%d %d", &nPos[i][0], &nPos[i][1]);
            }
        }


        for(int nIndex = 0; nIndex < n; nIndex++){
            int result = -1;
            for(int mIndex = 0; mIndex < m; mIndex++){
                //printf("%d\n", win[mIndex].lable);
                //printf("Has Value:%d %d %d %d\n", nPos[nIndex][0], nPos[nIndex][1], mIndex, isInScope(nPos[nIndex][0], nPos[nIndex][1], mIndex));
                //printf("Order Is:%d\n", win[mIndex].lable);
                if (isInScope(nPos[nIndex][0], nPos[nIndex][1], mIndex) == 1){
                    result = win[mIndex].lable;
                    if (mIndex != 0){
                        for(int i = 0; i < mIndex; i++){
                            swap(i, mIndex);
                        }
                    }
                    break;
                }
            }
        }
        for(int i = 0; i < 4; i++){
            printf("%d ", win[i].lable);
        }
    }
    return 0;
}
