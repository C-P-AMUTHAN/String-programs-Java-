import java.util.*;
public class StringReplace {
    public static void replace(String s, char c){
        String str=s;
        char v[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0; i<v.length; i++){
            s=s.replace(v[i], c);
        }
        System.out.println(s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        replace(s, c);
    }
}
