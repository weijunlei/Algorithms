#include <iostream>
#include <iomanip> // 控制输出精度
#include <cmath>

using namespace std;

int main(){
    int x, y, z, x1, y1, z1;
    while (cin >> x >> y >> z >> x1 >> y1 >> z1){
            double r = (double)((x1 - x) * (x1 -x) + (y1 - y) * (y1 - y) + (z1 - z) * (z1 - z));
            r = sqrt(r);
            cout << fixed << setprecision(3) << r << " " << acos(-1) * r * r * r * 4 / 3 << endl;
           }
    return 0;
}
