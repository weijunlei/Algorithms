#include <iostream>
#include <vector>
#include <string>

using namespace std;
// ͨ��̰����ȷ��ÿ���������������ܹ��ܵ�������룬Ȼ�����ε��ӵõ����Ľ�
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
            int count = 0; //Ŀǰ���ʵ��ĵڼ���������
            int whichUsed = -1; //Ŀǰ����ʹ�õķ�����
            int tempUsed = -1; // �ж����������ʱ�

            while(count != m){
                for (int i = 0; i  < n; i++){
                    if (i == whichUsed){ // ��������ʹ�õı㲻���л�
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
