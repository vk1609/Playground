import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int no;
      Scanner sc= new Scanner(System.in);
      no=sc.nextInt();
      int temp=no;
      int i=0;
      while(temp>0){
      temp/=10;
        i++;
 }
      if(i==3)
      {temp=no;
       temp/=10;
       temp%=10;
        if(temp%3==0)
          System.out.println("Trendy Number");
       else
         System.out.println("Not a Trendy Number");
        
      }
      else
        System.out.println("Not a Trendy Number");
      
    }
}