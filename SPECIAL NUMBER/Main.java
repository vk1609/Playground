import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int m,n;
      int sum=0,prod=1;
      int temp;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
      n=sc.nextInt();
      
      while(m<=n){
        temp=m;
        sum+=temp%10;
        prod*=temp%10;
        temp/=10;
        sum+=temp%10;
        prod*=temp%10;
        
        if(m==sum+prod)
          System.out.println(m);
        sum=0;
        prod=1;
        m++;
      }
    }
}