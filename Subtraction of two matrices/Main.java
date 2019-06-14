import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int r= sc.nextInt();
    int c=sc.nextInt();
    int matrix1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix1[i][j]=sc.nextInt();
      }
    }
    int matrix2[][]=new int[r][c];
     for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix2[i][j]=sc.nextInt();
      }
    }
    int sum[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        sum[i][j]=matrix1[i][j]-matrix2[i][j];
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(sum[i][j] +" ");
      }
      System.out.println();
    }
      }
    }
    
    
  