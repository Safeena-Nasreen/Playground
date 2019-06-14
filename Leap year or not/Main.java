import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year=in.nextInt();
      boolean flag=false;
      if(year%4==0)
      {
        if(year%100==0)
        {
          if(year%400==0)
            flag=true;
          else
            flag=false;
        }
        else
          flag=true;
      }
      else
      {
        flag=false;
      }
      if(flag==true)
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
    }
}