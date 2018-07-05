#include <iostream>
#include <vector>
#include <string>

using namespace std;
// 通过贪婪法确定每个代理服务器最多能够跑到的最长距离，然后依次叠加得到最后的解
int main(){
    int n = 0;
    int m = 0;
    int convertCount = 0;
    vector<string> a;
    vector<string> b;
    string temp;
    while(cin >> n){
        for(int i=0; i < n; i++){
            cin >> temp;
            a.push_back(temp);
        }
        cin >> m;
        for(int i = 0; i < m; i++){
            cin >> temp;
            b.push_back(temp);
        }

        if (n == 1){
            for(int i = 0; i < m; i++){
                if (a[0] == b[i]){
                    cout << -1 << endl;
                    break;
                }
                else if(i == m - 1){
                    cout << 0 << endl;
                }
            }
        }
        else{
            int count = 0; //目前访问到的第几个服务器
            int whichUsed = -1; //目前正在使用的服务器
            int tempUsed = -1; // 判断最长步数的临时最长

            while(count != m){
                for (int i = 0; i  < n; i++){
                    if (i == whichUsed){ // 遇到正在使用的便不能切换
                        continue;
                    }
                    for(int j = count; j < m; j++){
                        if(a[i] == b[j]){
                            if (tempUsed < j){
                                tempUsed = j;
                                whichUsed = i;
                            }
                            break;
                        }
                        else if(j == m - 1){
                            count = m;
                            break;
                        }
                    }
                }

                if (count != m){
                    convertCount ++;
                    count = tempUsed;
                }
                tempUsed = -1;
            }
            cout << convertCount <<endl;
            convertCount = 0;
        }
    }

    return 0;
}
