//here we are going to find the prime numbers which are given between certain range
class Prime2{
    public static void main(String[] args) {
        int primecount=0;
    int a =10;int b=35;
        for(int i=a;i<=b;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                
                }
            }
            if(count==2){
                primecount++;
                
            }
            
            

        }
        System.out.println(primecount);
    
        
    }
}