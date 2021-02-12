import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
  
    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int stringLength = str.length();
		
		
		for(int i = 0; i < stringLength; i++){
			char letter = str.charAt(i);
         
          char upper = Character.toUpperCase(letter);
          System.out.println(upper);
        }
			
  }
  }
