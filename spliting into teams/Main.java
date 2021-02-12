import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
  Scanner sc= new Scanner(System.in);
  
  int no,team;
  no=sc.nextInt();
  team=sc.nextInt();
  
  System.out.println("The number of students in each team is "+(int)(no/team)+" and left out is "+(int)(no%team));

}
}