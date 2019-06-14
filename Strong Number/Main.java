import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int n1 = num;
      int sum=0;
      while(num>0)
      {
        int i=1;
        int fact=1;
       int last_digit=num%10;
      for(i=1;i<=last_digit;i++)
      {
        fact=fact*i;
      }
      sum = sum + fact;
      num=num/10;
      }
      if(sum == n1)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}