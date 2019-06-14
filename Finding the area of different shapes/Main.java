import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int option=sc.nextInt();
      switch(option)
      {
          case 1:
               int side=sc.nextInt();
               int area_square=side*side;
               System.out.println(area_square);
               break;
        case 2:
             int l=sc.nextInt();
             int b=sc.nextInt();
            int area_rec=l*b;
            System.out.println(area_rec);
          break;
        case 3:
            int h= sc.nextInt();
          int bi=sc.nextInt();
          int area_tri=(h*bi)/2;
          System.out.println(area_tri);
          break;
        case 4:
            int r=sc.nextInt();
          double area_cir=3.14*r*r;
          System.out.println(area_cir);
          break;
      }
    }
}