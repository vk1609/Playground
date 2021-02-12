import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int temp,count=0;
      Scanner sc= new Scanner(System.in);
      temp=sc.nextInt();
      
      while(temp>1){
        count++;
       System.out.println(temp);
        if(temp%2==0)
          temp/=2;
        else
          temp=3*temp+1;
      }
      System.out.println(1);
      System.out.println(count);
      
    }
}