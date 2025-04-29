import java.util.Scanner;
class Voting{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your age");
    int a=sc.nextInt();
    if(a>18){
        System.out.println("you are eligible");
    }
    else{
        System.out.println("you are not eligible");
    }
}
}