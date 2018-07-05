#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct stu{
    string name;
    unsigned int grade;
};
void printmethod(vector<stu> &v, int method);

int main(){
    int num;
    int method;
    vector<stu> v;
    while(cin >> num >> method){
        for(int i = 0; i < num; i++){
            stu s;
            cin >> s.name >> s.grade;
            v.push_back(s);
        }
    }

    printmethod(v, method);
}

void printmethod(vector<stu> &v, int method){
    if (v.empty()){
        return;
    }
    int max = 0;
    int beginIndex, endIndex;
    for(int i = 0 ; i < v.size(); i++){
        max = max > v[i].grade ? max : v[i].grade;
    }

    if (method == 0){
        for(int i = max; i >= 0; i--){
            for(int j = 0 ; j < v.size(); j++){
                if (v[j].grade == i){
                    cout << v[j].name << " " << v[j].grade << endl;
                }
            }
        }
    }
    else if (method == 1){
        for(int i = 0; i <= max; ++i){
            for(int j = 0 ; j < v.size(); j++){
                if (v[j].grade == i){
                    cout << v[j].name << " " << v[j].grade << endl;
                }
            }
        }
    }
}
