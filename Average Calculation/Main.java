import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scanner = new Scanner(System.in);
       
        /* Declaring array of n elements, the value
         * of n is provided by the user
         */
        float[] arr = new float[5];
        float total = 0;

        for(int i=0; i<arr.length; i++){
        	
        	arr[i] = scanner.nextFloat();
        }
   
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }


        
        float average = total / arr.length;
        
        System.out.println(average);
      // fill your code
    }
}