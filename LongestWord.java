import java.util.*;
import java.lang.*;
public class LongestWord {
    public static void word(String s){
        String str[]=s.split(" ");
        int x=str.length;
        int len[]=new int[x];
        int c=0;
        for(int i=0; i<x; i++){
            for(int j=0; j<str[i].length(); j++){
                len[c]++;
            }
            c++;
        }
        int a=0, max=len[0];
        for(int k=0; k<x; k++){
            if(len[k]>max){
                max=len[k];
                a=k;
            }
        }
        System.out.print(str[a]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        word(s1);
    }
}
