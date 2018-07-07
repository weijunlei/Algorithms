#include <stdio.h>

typedef struct GOOD{
    double weight; // 物品总重
    double value; // 物品价值
    double valpweight; // 性价比
}Goods;

void swap(Goods* goods, int m, int n){
    double tempWeight = goods[m].weight;
    double tempValue = goods[m].value;
    double tempValpWeight = goods[m].valpweight;
    goods[m].weight = goods[n].weight;
    goods[m].value = goods[n].value;
    goods[m].valpweight = goods[n].valpweight;
    goods[n].weight = tempWeight;
    goods[n].value = tempValue;
    goods[n].valpweight = tempValpWeight;
}

int getPartition(Goods *goods, int left, int right){
    Goods getGood = goods[left];
    int getIndex = left;
    for(int i = left + 1; i <= right; i++){
        if (getGood.valpweight < goods[i].valpweight){
            getIndex++;
            swap(goods, getIndex, i);
        }
    }
    swap(goods, getIndex, left);
    return getIndex;
}

void quickSort(Goods* goods, int left, int right){
    if (right > left){
        int getIndex = getPartition(goods, left, right);
        quickSort(goods, left, getIndex - 1);
        quickSort(goods, getIndex + 1, right);
    }
}

int main(){
    int m;
    int n;
    while(scanf("%d %d", &m, &n) != EOF && (m != -1 && n != -1)){
        double maxWeight = 0;
        Goods goods[n];
        for(int i = 0; i < n; i++){
            double weight = 0;
            double value = 0;
            scanf("%lf %lf", &weight, &value);
            goods[i].weight = weight;
            goods[i].value = value;
            goods[i].valpweight = (double)weight / value;
        }
        quickSort(goods, 0, n - 1);
        for(int i = 0; i < n; i++){
            if (m > goods[i].value){
                m = m - goods[i].value;
                maxWeight += goods[i].weight;
            }
            else{
                maxWeight += m * goods[i].valpweight;
                m = 0;
                break;
            }
        }
        printf("%.3lf\n", maxWeight);
    }
}
