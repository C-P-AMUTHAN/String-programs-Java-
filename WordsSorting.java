import java.util.*;
public class WordsSorting {
    public static void sort(String s){
        String str[]=s.split(" ");
        int l[]=new int[str.length];
        for(int i=0; i<str.length; i++){
            int x=str[i].length();
            l[i]=x;
        }
        for(int c=0; c<str.length-1; c++){
            for(int p=0; p<str.length-1; p++){
                if(l[p]>l[p+1]){
                    int temp=l[p];
                    l[p]=l[p+1];
                    l[p+1]=temp;
                }
            }
        }
        for(int j=0; j<str.length; j++){
            for(int k=0; k<str.length; k++){
                if(l[j]==str[k].length()){
                    System.out.print(str[k]+" ");
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
