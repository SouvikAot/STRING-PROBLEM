public class Encryption {
    public static void main(String[] args) {
        String str="abcde";
        int rnew=0,r=0;
        String strnew=new String();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch+3<='z'){
                char newch=(char)(ch+3);
                strnew+=newch;
            }
            else {
                 r=('z'-ch);
                 rnew=3-r;
                char ch1= (char)('a' + rnew-1);
                strnew+=ch1;
            }
        }
        System.out.println(strnew);
    }
}
