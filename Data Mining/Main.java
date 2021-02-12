import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int no;
      Scanner sc= new Scanner(System.in);
      no=sc.nextInt();
      int i=1,temp,so=0,se=0;
      temp=no;
      while(temp>0){
        
        if(i%2!=0){
          so+=temp%10;
        }else{
          se+=temp%10;}
        i++;
        temp/=10;
        
      }
      if(so==se)
        System.out.println("yes");
      else
        System.out.println("No");
      
    }
}