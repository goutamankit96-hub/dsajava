

public class vowels {
    public static int vowels(String str,int i){


    if(i==str.length()) return 0;
    char ch = str.charAt(i);
    int count = (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' ||ch == 'u' )? 1:0;
    return count + vowels(str,i+1);

    }
    public static void main(String[] args){
        String str = "hello";
        int i=0;
        System.out.println(vowels(str,i));
    }
    
}