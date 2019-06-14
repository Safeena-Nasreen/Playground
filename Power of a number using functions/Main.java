import java.util.Scanner;
import java.lang.Math;
public class Main
{
  public static void power(int a,int b)
  {
  System.out.print(Math.pow(a,b));
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    power(n,m);
  }
}
     