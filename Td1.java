//in  this program we are going to count the number of each alphabet present in a given word
class Td1{
    public static void main(String[] args) {
        String n="MALAYALAM";
        n=n.toLowerCase();
        int[] alphabetcount=new int[26];
        for(char ch:n.toCharArray()){
            if(ch>='a' && ch<='z'){
                alphabetcount[ch-'a']++;
            }
        }
        System.out.println("alphabet count: ");
        for(int i=0;i<26;i++){
            if (alphabetcount[i]>0){
                System.out.println((char)(i+'a')+":"+alphabetcount[i]);
            }
        }
    }
}
/*
first we are declaring a string in n
then after that we are turning all of them into small letter because it will be very easier to count 
for that purpose we are using toLowercase
then we are cretaing a array alphabet count to store  the values at first it will have all its value as zero then it will increase doen
next we are using for loop so take each string we are using as
for(char ch:n.toCharArray)here we are turing it into seperate characters and sending them to array
then using if condition to check then printing it again*/