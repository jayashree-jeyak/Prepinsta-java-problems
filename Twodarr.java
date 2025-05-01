import java.util.Scanner;
class Twodarr{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the row: ");
      int a=sc.nextInt();
      System.out.print("Enter the column: ");
      int b=sc.nextInt();
      int arr[][]=new int[a][b];
      System.out.print("enter the elements in the array: ");
      for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
          arr[i][j]=sc.nextInt();
        }
      }
      System.out.println("the elements in the array are:");
      for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
         

        
        
          System.out.print(arr[i][j]+" ");
          
        }
        System.out.println("");


  }
}
}

