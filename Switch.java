import java.util.Scanner;
class Switch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the day: ");
        int a=sc.nextInt();
        
        switch (a) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            default -> System.out.println("invalid");
        }
    }
}