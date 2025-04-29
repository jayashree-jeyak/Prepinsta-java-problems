import java.util.Scanner;
class Operations{
     static void addition(int a,int b){
            int sum=a+b;
            System.out.println(sum);
        }

        static void subtraction(int a,int b){
            int sub=a-b;
            System.out.println(sub);
        }

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         System.out.print("enter your operations: ");
        String c=sc.nextLine();
        System.out.print("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(c.equalsIgnoreCase("add")){
            addition(a,b);
        }
        else if(c.equalsIgnoreCase("sub")){
            subtraction(a,b);
        }

       

       
        
    }
}