import java.util.Scanner;
import java.lang.*;
public class ReverseStringAlphabets {
    public static void alphabetSwap(String S){
        int i=0;
        int j=S.length()-1;
        StringBuilder s=new StringBuilder(S);
        while(i<j){
            while(!(s.charAt(i)>=97 && s.charAt(i)<=122)||!(s.charAt(i)>=48 && s.charAt(i)<=57)){
                i++;
            }
            while(!(s.charAt(j)>=97 && s.charAt(j)<=122)||!(s.charAt(j)>=48 && s.charAt(j)<=57)){
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
        alphabetSwap(s);
    }
}
