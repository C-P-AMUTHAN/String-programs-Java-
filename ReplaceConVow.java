import java.util.*;
public class ReplaceConVow {
    public static void Replace(String s){
        char str[]=s.toCharArray();
        for(int i=0; i<str.length; i++){
            if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'){
                str[i]+=1;
            }
            else{
                str[i]='%';
            }
        }
        String S=new String(str);
        System.out.println(S);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        Replace(s1);
    }
}
