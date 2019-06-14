import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner input= new Scanner(System.in);
    String s= input.nextLine();
    int length=s.length();
    double aftdec=0;
    double befdec=0;
    int flag=0;
    for(int i=0; i<length; i++)
    {
      if(s.charAt(i)=='.')
        flag=1;
    }
    if(flag==1)
    {
      for(int i= length-1;s.charAt(i)!='.'&&i>0;i--)
          {
            aftdec=aftdec/10+(s.charAt(i)-'0');
          }
          aftdec=aftdec/10;
            for(int i=0;s.charAt(i)!='.';i++)
          {
            befdec=befdec*10+(s.charAt(i)-'0');
          }
          }
          else
          {
            for(int i=0;i<length;i++)
            {
              befdec=befdec*10+(s.charAt(i)-'0');
            }
          }
             double sum=(aftdec+befdec);
       System.out.printf("%.6f",sum);                        
  }
}