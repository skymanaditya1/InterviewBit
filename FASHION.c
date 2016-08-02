#include<stdio.h>
#include<stdlib.h>

int main()
{
	int t, n;
	scanf("%d", &t);
	int i;
	for (i=0; i<t; i++){
		int hotness = 0;
		scanf("%d", &n);
		int men[n];
		int women[n];
		int j;
		for(j=0; j<n;j++)
			scanf("%d", &men[j]);
		for (j=0; j<n; j++)
			scanf("%d", &women[j]);
		// function to sort the two arrays
		qsort(men, n, sizeof(int), cmpfun);
		qsort(women, n, sizeof(int), cmpfun);
		for(j=0; j<n; j++){
			hotness += men[j] * women[j];
		}
		printf("%d\n", hotness);
		
	}
	return 0;
}

int cmpfun(const void *a, const void *b){
	return (*(int *)a - *(int *)b);
}