import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int a,b,c;
      a=0;
      b=0;
      c=1;
      int t,temp;
      Scanner sc= new Scanner(System.in);
      t=sc.nextInt();
      System.out.print(a+" "+b+" "+c+" ");
      t=t-3;
      while(t>0){
       temp=c;
        c=a+b+c;
        a=b;
        b=temp;
        System.out.print(c+" ");
        
        t--;
      }
      
    }
}