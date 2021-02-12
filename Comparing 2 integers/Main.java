import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int a, b;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      if(a>b){
        System.out.println(a +" greater than "+ b);// fill the code;
    }else if(b>a){
        System.out.println(a +" less than "+ b);
      }
      else
      {
        System.out.println(a +" and "+ b + " are equal");
      }
    }
}