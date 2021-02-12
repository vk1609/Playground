import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in); 
     int n = sc.nextInt();
      int[] arr = new int[n];
      int temp = arr[0];
      for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      for(int i = 0; i<n; i++){
      if(arr[i]>temp){
        temp = arr[i];
      }
      }
     System.out.println(temp+" is the maximum element in the array"); //fill the code;
    }
}