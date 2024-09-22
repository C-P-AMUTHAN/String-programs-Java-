import java.util.*;
public class CountOfLetters {
    public static void countOf(String s){
        int v=0, c=0, d=0, sp=0, sy=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                v++;
            }
            if(48<=s.charAt(i) && s.charAt(i)<=57){
                d++;
            }
            if(s.charAt(i)=='#'){
                sy++;
            }
            if(s.charAt(i)==' '){
                sp++;
            }
        }
        int C=s.length()-(v+d+sp+sy);
        System.out.println(v+" "+C+" "+d+" "+sp+" "+sy);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        countOf(s1);
    }
}
