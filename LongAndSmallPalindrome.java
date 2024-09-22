import java.util.*;
public class LongAndSmallPalindrome {
    public static int reverse(String str){
        int len = str.length();
        int c=1;
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                c=0;
            }
        }
        if(c==0)
        return 1;
        else
        return 0;
    }
    public static void palindrome(String s){
        String str[]=s.split(" ");
        for(int i=0; i<str.length; i++){
            if(reverse(str[i])==1)
            System.out.print(str[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s1=sc.nextLine();
        palindrome(s1);
    }
}
