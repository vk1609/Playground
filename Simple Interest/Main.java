import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int principle,period;
      float rate;
      Scanner sc= new Scanner(System.in);
      principle = sc.nextInt();
      period=sc.nextInt();
      rate=sc.nextFloat();
      System.out.printf("%.2f",principle*rate*period/100);
    }
}