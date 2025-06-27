class Td11{
    public static void main(String[] args) {
        String n="orgadam";
        n=n.toLowerCase();
        int[] alphabetcount=new int[26];
        for(char ch:n.toCharArray()){
            if(ch>='a' && ch<='z'){
                alphabetcount[ch-'a']++;
            }
        }
        System.out.println("ALPHABET COUNT: ");{
            for(int i=0;i<26;i++){
                if(alphabetcount[i]>0){
                    System.out.println((char)(i+'a')+":"+alphabetcount[i]);
                }
            }
        }


    }
}