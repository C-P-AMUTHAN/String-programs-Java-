import java.util.*;
import java.lang.*;
public class ReverseEachWord{
    public static void reverseWord(String s){
        String str[]=s.split(" ");
        for(int i=0; i<str.length; i++){
            StringBuilder s1=new StringBuilder(str[i]);
            s1.reverse();
            str[i]=s1.toString();
        }
        int n=str.length;
        for(int i=0; i<n/2; i++){
            String temp=str[i];
            str[i]=str[n-i-1];
            str[n-i-1]=temp;
        }
        String s2=String.join(" ",str);
        System.out.println(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S=sc.nextLine();
        reverseWord(S);
    }
}