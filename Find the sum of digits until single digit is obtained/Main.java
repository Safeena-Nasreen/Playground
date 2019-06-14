#include<stdio.h>
int main()
{
  int num,sod,i;
scanf("%d",&num);
sod=num;
while(sod>=10)
{
  sod=sumdigits(sod);
}
printf("%d",sod);
  return 0;
}
int sumdigits(int n)
{
  int rem,sum=0;
  while(n!=0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  return sum;
}


  