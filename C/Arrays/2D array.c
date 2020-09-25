#include<stdio.h>
main()
{
int a[3][3]={1,2,3,4,5,6,7,8,9};
int i,j;
printf("elements in an array\n");
for(i=0;i<=2;i++)
for(j=0;j<=2;j++)
printf("%d\n",a[i][j]);
printf("elements in tabular form\n");
for(i=0;i<=2;i++)
{
printf("\n");
for(j=0;j<=2;j++)
printf("%d\t",a[i][j]);
}
}
