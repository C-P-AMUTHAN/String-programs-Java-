import java.util.*;
public class ReverseWords {
    public static void words(String s){
        int x=s.length();
        String str="";
        int temp=x-1;
        for(int i=x-1; i>=0; i--){
            if(s.charAt(i)==' '){
                str+=s.substring(i+1,temp+1);
                str+=' ';
                temp=i-1;
            }
        }
        for(int j=0; j<x; j++){
            if(s.charAt(j)==' '){
                str+=s.substring(0, j);
                break;
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        words(s);
    }
}
