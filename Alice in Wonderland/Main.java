import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Alice must go in path-"+sum);
    }// fill your code
	
}