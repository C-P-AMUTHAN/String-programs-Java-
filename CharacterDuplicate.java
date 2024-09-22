import java.util.*;
import java.lang.*;
public class CharacterDuplicate {
    public static void duplicate(String s){
        int n=s.length();
        int hash[]=new int[26];
        for(int i=0; i<n; i++){
            hash[s.charAt(i)-97]++;
        }
        for(int i=0; i<n; i++){
            if(hash[s.charAt(i)-97]>0){
                System.out.print(s.charAt(i));
                hash[s.charAt(i)-97]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        duplicate(s1);
    }
}
