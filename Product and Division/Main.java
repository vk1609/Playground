import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a, b, pro, div, mod;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      pro = a*b;
      div = a/b;
      mod = a%b;
      System.out.println(pro);
       System.out.println(div);
       System.out.println(mod);
      // fill your code
    }
}