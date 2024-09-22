import java.util.*;
public class CountWords {
    public static void count(String s){
        int count=0;
        int x=s.length();
        String t=" ";
        for(int i=0; i<x; i++){
            if(s.charAt(i)==t.charAt(0))
            count++;
        }
        System.out.println(count+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        count(s);
    }
}
