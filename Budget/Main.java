import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      Double bFc = 350.34;
      Double vSc = 230.90;
      Double aSc = 190.55;
      Double aC = 125.30;
      Double lC = 180.90;
      int bF = sc.nextInt();
      int vS = sc.nextInt();
        int aS = sc.nextInt();
        int a = sc.nextInt();
        int l  = sc.nextInt();
      Double totalSum = (bF*bFc)+(vS*vSc)+(aS*aSc)+(aC*a)+(lC*l);
      if(totalSum > 15000){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }// fill your code
	}
}