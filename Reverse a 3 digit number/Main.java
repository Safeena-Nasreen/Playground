import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your Sccode here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int fd=n/100;
    int sd=((n/10)%10);
    int ld=n%10;
    int reverse=ld*100+sd*10+fd;
    System.out.println(reverse);
  }
}