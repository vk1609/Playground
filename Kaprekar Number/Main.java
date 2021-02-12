import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code;
      int n;
      Scanner sc= new Scanner(System.in);
      n=sc.nextInt();
      int temp=(int)Math.pow(n,2);
      int sum=0;
      
      while(temp>0){
       sum+=temp%10; 
        temp/=10;
      }
        if(sum==n)
          System.out.println("Kaprekar Number");
      else
        System.out.println("Not a Kaprekar Number");
    }
}