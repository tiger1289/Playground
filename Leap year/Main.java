#include<stdio.h>
int main()
{
  int year;
  scanf("%d",&year);
   if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
      printf("Leap year", year);
   else
      printf("Not Leap year", year);
  //Type your code here
  return 0;
}