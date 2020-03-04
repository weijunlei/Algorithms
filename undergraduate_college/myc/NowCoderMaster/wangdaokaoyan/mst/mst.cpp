#include <stdio.h>

struct Countryside{
    int a;
    int b;
    int length;
}road[100];
int Tree[101];

int findRoot(int x){
    if (Tree[x] == -1){
        return x;
    }
    else{
        int temp = findRoot(Tree[x]);
        Tree[x] = temp;
        return temp;
    }
}

void swap(int m, int n){
    int tempA = road[m].a;
    int tempB = road[m].b;
    int tempLength = road[m].length;
    road[m].a = road[n].a;
    road[m].b = road[n].b;
    road[m].length = road[n].length;
    road[n].a = tempA;
    road[n].b = tempB;
    road[n].length = tempLength;
}

int getPartition(int left, int right){
    int getLength = road[left].length;
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getLength > road[i].length){
            getIndex ++;
            swap(getIndex, i);
        }
    }
    swap(left, getIndex);
    return getIndex;
}

void quickSort(int left, int right){
    if (right > left){
        int getIndex = getPartition(left, right);
        quickSort(left, getIndex - 1);
        quickSort(getIndex + 1, right);
    }
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF && n != 0){
        for(int i = 1; i <= n; i++){
            Tree[i] = -1;
        }
        int allPath = (n * (n - 1)) / 2;
        for(int i = 0; i < allPath; i++){
            scanf("%d %d %d", &road[i].a, &road[i].b, &road[i].length);
        }
        quickSort(0, allPath - 1);
        int minLength = 0;
        for(int i = 0; i < allPath; i++){
            //printf("%d %d %d\n", road[i].length, road[i].a, road[i].b);
            int a = road[i].a;
            int b = road[i].b;
            a = findRoot(a);
            b = findRoot(b);
            //printf("root compare: %d %d\n", a, b);
            if (a != b){
                Tree[a] = b;
                //printf("addLength:%d\n", road[i].length);
                minLength += road[i].length;
            }
        }

        printf("%d\n", minLength);

    }
    return 0;
}
