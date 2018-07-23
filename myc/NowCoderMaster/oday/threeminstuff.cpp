#include <stdio.h>
#include <algorithm>
#include <string.h>

using namespace std;

struct Stuff{
    int stuNum;
    char name[11];
    int age;
}stu[30];

bool cmp(Stuff a, Stuff b){
    if (a.age == b.age){
        if (a.stuNum != b.stuNum){
            return a.stuNum < b.stuNum;
        }
        else{
            return strcmp(a.name, b.name) < 0;
        }
    }
    return a.age < b.age;
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        for(int i = 0; i < n; i++){
            scanf("%d%s%d", &stu[i].stuNum, stu[i].name, &stu[i].age);
        }
        sort(stu, stu+n, cmp);
        for(int i = 0; i < 3; i++){
            printf("%d %s %d\n", stu[i].stuNum, stu[i].name, stu[i].age);
        }
    }

    return 0;
}
