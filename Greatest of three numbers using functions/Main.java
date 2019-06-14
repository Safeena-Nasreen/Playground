import java.util.Scanner;
class Main{
  public static int greatest(int a,int b)
  {
    int max;
    if(a>b)
     max=a;
    else 
      max=b;
    return max;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int gre=greatest(n1,n2);
      int n3=in.nextInt();
      gre=greatest(gre,n3);
      System.out.print(gre);
    }
	}
