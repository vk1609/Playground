import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int  a = 0;
      int  a1=1, size=0;
     
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i =2; i<n; i++){
       
        size=a+a1;    
   
  a=a1;    
  a1=size; 
      }
      System.out.println(size);
    
    }
}