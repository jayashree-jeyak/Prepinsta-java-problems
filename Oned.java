import java.util.Scanner;
class Oned{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size: ");
        int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("enter the array values: ");

    for (int i=0;i<n;i++){
        
      arr[i]=sc.nextInt();

    }
    for (int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
        
    }}
    
    