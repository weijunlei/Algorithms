#include <stdio.h>
#include <stdlib.h>

void MatrixChainOrder(int p[], int n, int m[][7], int* s[][7]) {
	if (n == 0) {
		return;
	}
	for (int i = 0; i < n; i++) {
		m[i][i] = 0;
	}

	for (int len = 2; len <= n; len++) {
		for (int i = 1; i < n - len + 1; i++) {
			int j = i + len - 1;
			m[i][j] = -1;
			for (int k = i; k < j; k++) {
				int tempCount = m[i][k] + p[i - 1] * p[k] + p[j] + m[k + 1][j];
				if (tempCount < m[i][j] || m[i][j] == -1) {
					m[i][j] = tempCount;
					s[i][j] = k;
				}
			}
		}
	}

}

void PrintOptimalParens(int s[][7], int i, int j) {
	if (i == j) {
		printf("A%d", i);
	}

	else
	{
		printf("(");
		PrintOptimalParens(s, i, s[i][j]);
		PrintOptimalParens(s, s[i][j] + 1, j);
		printf(")");
	}
}

int main() {
	int matrixs[] = {30, 35, 15, 5, 10, 20, 25};
	int length = sizeof(matrixs) / sizeof(matrixs[0]);
	int m[7][7] = { 0 };
	int s[7][7] = { 0 };

	MatrixChainOrder(matrixs, length, m, s);
	PrintOptimalParens(s, 1, 6);

	return 0;
}