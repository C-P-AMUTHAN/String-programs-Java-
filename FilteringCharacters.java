import java.util.*;
public class FilteringCharacters {

    // Method to filter
    public static void filter(String broadcast){
        ArrayList<Character> list = new ArrayList<>();
        for(char ch: broadcast.toCharArray()){
            list.add(ch);
        }
        String filtered = "";
        for(int i=0; i<list.size(); i++){
            if((list.get(i) <= 'z' && list.get(i) >= 'a') || (list.get(i) <= 'Z' && list.get(i) >= 'A')){
                filtered += list.get(i)+"";
            }
        }
        System.out.println(filtered);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String broadcast = sc.nextLine();
        // String broadcast = "apple$#5is@39a+*3@fruit";
        filter(broadcast);
        sc.close();
    }
}

/* I used ASCII value logic here, but we can also use isLetter() method of Character and remove() of ArrayList
 * 
 * int index = 0;
 * while(index < list.size()){
 *    char ch = list.get(index);
 *    if(Character.isLetter(ch)){
 *         index +=1;
 *    }else{
 *         list.remove(index);
 *    }
 * }
 * 
 * Instead of ArrayList we can also use StringBuffer
 * 
 * The most efficient way is using regular expression in String. 
 * String filter = broadcast.replaceAll("[^a-z]","");
 * [^a-z] = other than alphabets (a to z)
 * 
 */