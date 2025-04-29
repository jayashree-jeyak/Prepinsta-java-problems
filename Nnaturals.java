import java.util.Scanner;
  class Nnaturals{
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
     System.out.print("enter number: ");
     int a=sc.nextInt();
     if(a>0){
       for(int i=1;i<=a;i++){
        System.out.println(i);
       }
     }
  }
  }
