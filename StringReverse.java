import java.util.*;
public class StringReverse {
    public static void reverse(String str){
        String rev = "";
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        System.out.print(rev);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
}
