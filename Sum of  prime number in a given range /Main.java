#include<stdio.h>
int main()
{
  //Type youe code here
  int end,i,j,sum=0,flag;
scanf("%d",&end);
 for(i=2;i<=end;i++)
  {
   flag=1;
  for(j=2;j<=i/2;j++)
  {
    if(i%j==0)
    {
      flag=0;
      break;
    }
  }
  if(flag==1)
  {
    sum=sum+i;
  }
 }
  printf("%d",sum);
 return 0;
}
  