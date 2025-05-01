//here i am going to use the break statement so the program breaks when it is a multiple of 13
class Break{
    public static void main(String args[]){
     for(int i=1;i<=20;i++){
        System.err.println(i);
        if(i%13==0){
            break;
        }
     }

    }
}