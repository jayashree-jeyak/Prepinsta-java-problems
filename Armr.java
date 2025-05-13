
class Armr{
    public static void main(String[] args) {
        int a=100;
        int b=999;
        //double sum=0;
        //int len =0;
        int count=0;
        for(int i=a;i<=b;i++){
            int temp=i; 
            int temp1=i;
            double sum=0;
            int len=0;
            while(temp1>0){
             len++;
             temp1=temp1/10;
            }
            while(temp>0){
                int rem=temp%10;
                sum=sum+Math.pow(rem,len);
                temp=temp/10;
                  }    
                  if(i==sum){
            count++; 
        }
        
        }
        System.out.println(count);

    }
}