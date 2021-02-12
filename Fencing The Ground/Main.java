import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    Scanner sc= new Scanner(System.in);
    
    int len,b;
    len=sc.nextInt();
    b=sc.nextInt();
    
    System.out.println(len*2+b*2+"m");
    System.out.println(len*b+"sqm");
  }
}