class Prime{
    public static void main(String[] args) {
        int count =0;
        int n=10;
        for (int i = 1; i < 10; i++) {
            if(n/i==0){
                count++;
            }
         
        }
        if(count==2){
            System.out.println("is a prime num");
         }   
         else{
            System.out.println("not a prime num");
         }
    }
}