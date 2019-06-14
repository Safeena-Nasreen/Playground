import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int first_digit;
    while(num>100)
    {
      num=num/10;
    }
    first_digit=num%10;
    System.out.println(first_digit);
  }
}