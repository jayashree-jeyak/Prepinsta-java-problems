class Td3{
    public static void main(String[] args) {
        String input="HELLO everyone Nice TO meet you";
        StringBuilder converted=new StringBuilder();
        for(int i=0;i<input.length();i++){
            
            char ch=input.charAt(i);
            if(Character.isUpperCase(ch)){
                converted.append(Character.toLowerCase(ch));
            }
            else if(Character.isSpaceChar(ch)){
                converted.append(" ");
            }
            else if(Character.isLowerCase(ch)){
                converted.append(Character.toUpperCase(ch));
            }
            
        }
        System.out.println(converted);
    }
}