#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <algorithm>

using namespace std;

struct Student{
    char name[101];
    int age;
    int grade;
}stu[1000];

bool cmp(Student a, Student b){
    if (a.grade == b.grade){
        if (strcmp(a.name, b.name) == 0)
            return a.age < b.age;
        else
            return strcmp(a.name, b.name) < 0;
    }
    return a.grade < b.grade;
}


int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        for(int i = 0; i < n; i++){
            scanf("%s%d%d", stu[i].name, &stu[i].age, &stu[i].grade);
        }
        sort(stu, stu + n, cmp);
        for(int i = 0; i < n; i++){
            printf("%s %d %d", stu[i].name, stu[i].age, stu[i].grade);
            if (i != n - 1){
                printf("\n");
            }
        }
    }

    return 0;
}
