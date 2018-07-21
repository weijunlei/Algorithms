#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct Road{
    int sPoint;
    int ePoint;
    int cost;
}road[5000];

int roadNum;
int root[101];

void swap(int m, int n){
    int tempSPoint = road[m].sPoint;
    int tempEPoint = road[m].ePoint;
    int tempCost = road[m].cost;
    road[m].sPoint = road[n].sPoint;
    road[m].ePoint = road[n].ePoint;
    road[m].cost = road[n].cost;
    road[n].sPoint = tempSPoint;
    road[n].ePoint = tempEPoint;
    road[n].cost = tempCost;
}

int getPartition(int left, int right){
    //srand((unsigned)time(NULL));
    srand((unsigned)time(NULL));
    //printf("Hello World3\n");
    int randomInt = rand() % (right - left) + left;
    swap(left, randomInt);
    int getCost = road[left].cost;
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getCost > road[i].cost){
            getIndex ++;
            swap(getIndex, i);
        }
    }
    swap(getIndex, left);
    return getIndex;
}

void quickSort(int left, int right){
    if (right > left){
        int getIndex = getPartition(left, right);
        quickSort(left, getIndex - 1);
        quickSort(getIndex + 1, right);
    }
}

int findRoot(int x){
    if (root[x] == -1){
        return x;
    }
    else{
        int temp = findRoot(root[x]);
        root[x] = temp;
        return temp;
    }
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        for(int i = 0; i < n; i++){
            root[i] = -1;
        }
        int roadSize = n * (n - 1) / 2;
        for(int i = 0; i < roadSize; i++){
            scanf("%d%d%d", &road[i].sPoint, &road[i].ePoint, &road[i].cost);
        }
        //printf("Hello World 1\n");
        quickSort(0, roadSize - 1);
        //printf("Hello World 2\n");
        int ans = 0;
        for(int i = 0; i < roadSize; i++){
            int a = findRoot(road[i].sPoint);
            int b = findRoot(road[i].ePoint);
            if (a != b){
                root[a] = b;
                ans += road[i].cost;
            }
        }

        printf("%d\n", ans);
    }
}
