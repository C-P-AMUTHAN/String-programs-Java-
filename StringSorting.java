import java.util.*;
public class StringSorting {
    public static void sort(String s){
        int n=s.length();
        int hash[]=new int[26];
        for(int i=0; i<n; i++){
            hash[s.charAt(i)-97]++;
        }
        for(int i=0; i<26; i++){
            if(hash[i]==1){
                int t=i+97;
                System.out.print((char)t);
            }
            if(hash[i]>1){
                for(int j=0; j<hash[i]; j++){
                    int t=i+97;
                    System.out.print((char)t);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        sort(s1);
    }
}
