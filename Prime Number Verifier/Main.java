// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
int num,flag=0,i;
  scanf("%d",&num);
  if(num==0||num==1)
    printf("neither");
  else
  {
  for(i=2;i<=num/2;i++)
  {
    if(num%i==0)
     flag=1;
  }
  if(flag==1)
    printf("composite");
  else
    printf("prime");
  }
  return 0;
}