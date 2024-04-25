public class Reverse2 {
    public static void main (String[] args){
        String str = "Hello how are you";
        int i,j;
        int pos=0;
        for(i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch==' '){
                for(j=i-1;j>pos;j--){
                    System.out.println(str.charAt(j));
                }
                System.out.println(" ");
                pos=i+1;
            }if (i==str.length()-1) {
                for(j=i;j>=pos;j--){
                    System.out.println(str.charAt(j));
                }
            }
        }
    }}