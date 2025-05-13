class Arm{
    public static void main(String[] args) {
        int n=15351;
        int temp=n;
        int dc=n;
        int len=0;
        double sum=0;
        while(n>0){
            len++;
            n=n/10;

        }
        while(dc>0){
            int rem=dc%10;
            sum=sum+Math.pow(rem,len);
            dc=dc/10;

        }
        if(temp==sum){
            System.out.println("is armstrong");
        }
        else{
            System.out.println("not a armstrong number");
        }

    

    }
}