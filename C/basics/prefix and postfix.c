#include<stdio.h>
int main()
{
	int a=5,x;
	x=a++ + ++a + --a + ++a + ++a + a++ + ++a + ++a;
//	x=++a;
	printf("%d\n%d",x,a);
}
