import java.util.*;
public class ExtraSpace{
    public static void space(String s){
        int x=s.length()-1;
        String M="";
        int t=0,a=0;
        for(int i=0; i<=x; i++){
            if(!(s.charAt(i)==' ')){
                M+=s.charAt(i);
                t=1;
                a=1;
            }
            else{
                if(t==a){
                    M+=' ';
                }
                a++;
            }
        }
        System.out.println(M);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        space(s1);
    }
}