import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int flag =0;
     Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       int[] arr1 = new int[n];
      int[] arr2 = new int[n];
      
      for(int i =0; i<n; i++){
        arr1[i] = sc.nextInt();
      }
            for(int i =0; i<n; i++){
        arr2[i] = sc.nextInt();
      }
    for(int i =0; i<n; i++){
      if(arr1[i]>=arr2[i]){
      flag++;
      }else{
         System.out.println("Incompatible");
      }
      if(flag == n)
        System.out.println("Compatible");
        
      
    }
            //type your code her
  }
}