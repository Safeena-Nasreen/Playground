import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=n;
      int sum=0;
      while(n>0)
      {
        int rem=n%10;
      sum=sum+rem*rem*rem;
      n=n/10;
      }
      if(sum==n1)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}