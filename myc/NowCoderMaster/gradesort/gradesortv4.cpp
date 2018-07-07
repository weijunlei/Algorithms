#include <iostream>
#include <algorithm>
#include <string.h>

using namespace std;

struct Student{
    char name[100];
    int grade;
    int age;
};

bool stuCmp(Student a, Student b){
    if (a.grade != b.grade){
        return a.grade < b.grade;
    }
    else if (strcmp(a.name, b.name) != 0){
        return strcmp(a.name, b.name) < 0;
    }
    else{
        return a.age < b.age;
    }
}

int main(){
    int n;
    Student stus[100];
    while(cin >> n){
        for(int i = 0; i < n; i++){
            cin >> stus[i].name >> stus[i].age >> stus[i].grade;
        }

        sort(stus, stus + n, stuCmp);
        for(int i = 0; i < n; i++){
            cout << stus[i].name << " " << stus[i].age << " " << stus[i].grade<<endl;
        }
    }
    return 0;
}
