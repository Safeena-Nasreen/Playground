#include<stdio.h>
int main()
{
  //Type your code here
   int term1;
  int term2;
  int temp,res,n,i;
scanf("%d",&n);
  if(n==1)
      printf("1");
   else if(n==2)
      printf("2");
   else
   {
     term1=1;term2=2;
      for(i=3;i<=n;i++)
      {
      res=term1+term2;
        term1=term2;
        term2=res;
      }
      printf("%d",res);
   }
      return 0;
      }
 
