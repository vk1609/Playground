import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
int n, i;
Scanner scan = new Scanner(System.in);
n = scan.nextInt();
for ( i = 1;i<=n ;i++)
{
    System.out.print(i);
  if(i%3==0)
  {
 System.out.print(",");}
}

 
	}
}
