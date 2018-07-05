#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

struct Student{
    int num;
    int grade;
    Student(int a, int b){
        num = a;
        grade = b;
    }
};

bool cmp(const Student& a, const Student& b){
    if (a.grade < b.grade || (a.grade == b.grade && a.num <= b.num)){
        return true;
    }
    else{
        return false;
    }
}
// TODO: 未对学号进行排序
int main(){
    int n;
    vector<Student> v;
    while (cin >> n){
        for (int i = 0; i < n; i ++)
        {
            Student* stu = new Student(-1, -1);
            cin >> (*stu).num >> (*stu).grade;
            v.push_back(*stu);
        }
        sort(v.begin(), v.end(), cmp);
        for(int i = 0; i < n; i++){
            cout << v[i].num << " " << v[i].grade << endl;
        }
    }
}
