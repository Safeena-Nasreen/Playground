#include<stdio.h>
int main()
{
  int n1,n2,n3,sc;
  scanf("%d%d%d",&n1,&n2,&n3);
  sc=second(n1,n2,n3);
  printf("second greatest = %d",sc);
  return 0;
}
int second(int p,int q,int r)
{
  if(p>q&&p>r)
    return q>r?q:r;
  else if(q>r)
    return p>r?p:r;
  else
    return p>q?p:q;
}