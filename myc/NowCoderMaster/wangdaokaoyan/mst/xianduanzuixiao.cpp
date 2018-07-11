#include <stdio.h>
#include <math.h>

double points[100][2];

struct Edge{
    int sIndex;
    int eIndex;
    double length;
}edges[5001];

int Tree[5001];

int findRoot(int x){
    if(Tree[x] == -1){
        return x;
    }
    else{
        int temp = findRoot(Tree[x]);
        Tree[x] = temp;
        return temp;
    }
}

double getInstance(int m, int n){
    double instance = sqrt((points[m][0] - points[n][0]) * (points[m][0] - points[n][0]) +\
                            (points[m][1] - points[n][1])*(points[m][1] - points[n][1]));
    return instance;
}

void swap(int m, int n){
    int tempS = edges[m].sIndex;
    int tempE = edges[m].eIndex;
    double tempLength = edges[m].length;
    edges[m].sIndex = edges[n].sIndex;
    edges[m].eIndex = edges[n].eIndex;
    edges[m].length = edges[n].length;
    edges[n].sIndex = tempS;
    edges[n].eIndex = tempE;
    edges[n].length = tempLength;
}

int getPartition(int left, int right){
    double getLength = edges[left].length;
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getLength > edges[i].length){
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
    while(scanf("%d", &n) != EOF){
        for(int i = 0; i < n; i++){
            scanf("%lf %lf", &points[i][0], &points[i][1]);
        }
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                edges[index].sIndex = i;
                edges[index].eIndex = j;
                edges[index].length = getInstance(i, j);
                index ++;
            }
        }

        int allPath = (n * (n - 1)) / 2;
        //printf("Edges: %d %d\n", index, allPath);
        quickSort(0, allPath - 1);
        for(int i = 0; i < allPath; i++){
            Tree[i] = -1;
            //printf("Edge: %lf %d %d\n", edges[i].length, edges[i].sIndex, edges[i].eIndex);
        }
        double answer = 0;
        for(int i = 0; i < allPath; i++){
            int a = edges[i].sIndex;
            int b = edges[i].eIndex;
            a = findRoot(a);
            b = findRoot(b);
            if (a != b){
                Tree[a] = b;
                answer += edges[i].length;
            }
        }

        printf("%.2lf\n", answer);

    }
}
