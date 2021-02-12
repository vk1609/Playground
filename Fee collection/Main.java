import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc= new Scanner(System.in);
      String stype;
      int tutfee,busfee,hostel;
      
      stype =sc.next();
      tutfee=sc.nextInt();
       busfee=sc.nextInt();
       hostel=sc.nextInt();
      float sum=0;
      
      
        switch(stype){
          case "MSDS":sum=tutfee+busfee;System.out.printf("%.2f",sum);break;
          case "MSH":sum=tutfee+hostel;System.out.printf("%.2f",sum);break;
          case "MGSDS":sum=tutfee*15/10+busfee;System.out.printf("%.2f",sum);break;
          case "MGSH": sum=tutfee*15/10+hostel;System.out.printf("%.2f",sum);break;
          default:System.out.println("Invalid");break;
        }
        
        
      
    }
}