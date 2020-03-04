#include <iostream>
#include <vector>

using namespace std;

int main(){
    int n;
    int method;
    vector<vector<string> > stu(101);
    if(cin >> n >> method){
        string name = "";
        int score;
        for (int i = 0; i < n; i++){
            cin >> name >> score;
            stu[score].push_back(name);
        }
    }

    if (method){
        for(int i = 0; i < 100; i++){
            if (stu[i].size() > 0){
                for(int j = 0; j < stu[i].size(); j++){
                    cout<<stu[i][j] << " "<< i << endl;
                }
            }
        }
    }

    else{
        for(int i = 100; i >= 0; i--){
            if(stu[i].size()){
                for(int j = stu[i].size() - 1; j >= 0; j--){
                    cout << stu[i][j] << " " << i << endl;
                }
            }
        }
    }

    return 0;
}
