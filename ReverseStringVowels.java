import java.util.*;
import java.lang.*;
public class ReverseStringVowels{
    public static void vowelsSwap(String S){
        int i=0;
        int j=S.length()-1;
        StringBuilder s=new StringBuilder(S);
        while(i<j){
            while(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')){
                i++;
            }
            while(!(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'||s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U')){
                j--;
            }
            if(i<j){
                char temp=s.charAt(i);
                char temp1=s.charAt(j);
                s.setCharAt(j,temp);
                s.setCharAt(i,temp1);
                i++;
                j--;
            }
        }
        String S1=s.toString();
        System.out.println(S1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        vowelsSwap(s);
    }
}