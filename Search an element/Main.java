import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int flag =0;
    
      int[] arr = new int[n];
      for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int a =sc.nextInt();
       for(int i =0; i<n; i++){
         if(arr[i]==a){
          flag++;
         }else{
          flag = flag;
         }
         
       }
      if(flag>=1)
           System.out.println(a+" is present in the array");
      else
        System.out.println(a+" is not present in the array");
      //fill the code;
    }
}