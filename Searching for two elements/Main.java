import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=in.nextInt();
    }
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int flag1=0;
      int flag2=0;
      int element_1_index=0;
      int element_2_index=0;
      for(int i=0;i<arr_size;i++)
      {
        if(search_elem_1==arr[i])
        {
          flag1=1;
          element_1_index=i;
          break;
        }
      }
       for(int j=0;j<arr_size;j++)
      {
        if(search_elem_2==arr[j])
        {
          flag2=1;
          element_2_index=j;
          break;
        }
      }
      if(flag1==1&&flag2==1)
      {
        System.out.println(element_1_index);
      System.out.println(element_2_index);
      }
      else if(flag1!=1&&flag2==1)
      {
        System.out.println("-1");
      System.out.println(element_2_index);
      }
       else if(flag1==1&&flag2!=1)
      {
        System.out.println(element_1_index);
      System.out.println("-1");
      }
      else
      {
        System.out.println("-1");
        System.out.println("-1");
      }
    }
}
        
      
      
      
         