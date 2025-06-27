class Td2{
    public static void main(String[] args) {
        String n="Hello WORld";
        StringBuilder converted =new StringBuilder();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            else if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            converted.append(ch);
        }
        System.out.println(converted.toString());
    }
}
/* in this program we are chaing the charcters like upper to lower and lower to upper 
by not using inbuild function 
so here we are using string builder beacuse here it creates a new empty string which can easily stores the newly appeneded string
then we are using loop to het out the char out
*/