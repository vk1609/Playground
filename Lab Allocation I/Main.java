import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
      int L1 = sc.nextInt();
      int L2 = sc.nextInt();
      int L3 = sc.nextInt();
      if(L1<L2 &&L1<L3)
      {
        System.out.println("L1");
      }else if(L2<L3 &&L2<L1){
        System.out.println("L2");
      }else{
        System.out.println("L3");
      }
      //fill the code;
    }
}