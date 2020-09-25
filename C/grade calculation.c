#include<stdio.h>
main()
{
float mark;

printf("enter the mark of the student");
scanf("%f",&mark);
if(mark>=90 && mark<=100)
printf("grade 0");
else if(mark>=80 && mark<=90)
printf("grade E");
else
printf("fail");
}
