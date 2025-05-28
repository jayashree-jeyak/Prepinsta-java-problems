//here we are printing the triangle shaped pattern in row 1 its 1 star in 2 2like that
/*
*
**
**
***
*/
class pat2{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(" * ");
              
            }
            System.out.println(" ");

        }
    }
}