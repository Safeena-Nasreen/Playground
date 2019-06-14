import java.util.Scanner;
public class Main{
  public static int greatest(int a,int b)
  {
    int min;
    int gcd=1;
    if(a<b)
      min=a;
    else
      min=b;
    while(min>1)
    {
      if((a%min==0)&&(b%min==0))
      {
        gcd=min;
        break;
      }
      min=min-1;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int gcd1=greatest(n1,n2);
      gcd1=greatest(gcd1,n3);
      System.out.print(gcd1); 
	}
}