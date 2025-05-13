//to check whether a number is a palindrome or not
class Pali{
    public static void main(String[] args) {
        int n=12345;
        int temp=n;
        int rev=0;
        while(n>0){
            int digits=n%10;
            rev=rev*10+digits;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("is  palindrome");
        }
        else{
            System.out.println("no");
        }
    }
}