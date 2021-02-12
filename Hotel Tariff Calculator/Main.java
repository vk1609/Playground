import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
      int x = sc.nextInt();
      Float cost = sc.nextFloat();
      Float days = sc.nextFloat();
      Float increasedPrice = cost+((cost*20)/100);
      switch(x){
        case 4:
          case 5:
          case 6:
          case 11:
          case 12:{
           Float ttc = days*increasedPrice;
            System.out.println(ttc);
            break;
            
          }
        case 1:
          case 2:
          case 3:
          case 7:
          case 8:
          case 9:
          case 10:{
            Float total = days*cost;
            System.out.println(total);
            break;
            
          }
          default :{
             System.out.println("Invalid Input");
          }
      
      }// fill your code
	}
}