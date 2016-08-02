#include<stdio.h>

int main(void)
{
	int n;
	scanf("%d", &n);
	int i, j;
	int count = 0;
	for (i=1; i<=n; i++){
		for (j=i; j<=n; j++){
			if (i * j <= n) count++;
		}
	}
	
	printf("%d", count);
	return 0;
}