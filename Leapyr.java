/* to find leap yr we know that we should divide the yr by 4 but that is incorrect we should
divide it by 400 also 
either the number should be divisible by 400 or by 4 but not 100
it will be lil confusing i will explain okay so if we take 1900 it is divided by 4 so that we might think it is leap yr 
that is the mistake we are doing if the yr is n multiples of 100 then frst check with 400 so 1900/400!=0 so it
is not a leap yr */
class leapyr{
    public static void main(String[] args) {
        int n=1900;
        if(n/400==0 || (n/4==0 && n/100!=0)){
            System.out.println("is a leap year");
        }
        else{
            System.out.println("not a leap yr");
        }
            }
}