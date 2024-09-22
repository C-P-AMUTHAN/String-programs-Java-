import java.util.*;
import java.lang.*;
public class StringPalindrome {
    public static int reverse(String str){
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                System.out.println("NO");
                return 0;
            }
        }
        System.out.println("YES");
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
}
