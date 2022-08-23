package String;
import java.util.*;
public class Practice {
    //Question - 1Count how many times lowercase vowels occured in a string entered by the user
    // public static void countLowercase(String str){
    //     Integer count = 0;
    //     for(int i =0;i<str.length();i++){
    //         char ch = str.charAt(i);
    //         if(ch == 'a' || ch == 'e' || ch== 'i' || ch=='o' || ch == 'u'){
    //             count++;
    //         }
    //     }
    //     System.out.println("count of vowels are : "+ count);
    // }


    //Question - 2 Determine if 2 Strings are anagrams of each other.
    //Anagrams - If two strings contain  the same characters but in a different order,they can be said to be anagrams
    public static void checkAnagrams(String str, String str1){
        // first convert all words to lowercase 
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
                if(str.length() == str1.length()){
                    //converting string into character array
                    char[] strcharArray = str.toCharArray(); 
                    char[] str1charArray = str1.toCharArray(); 
                    //sort the char array
                    Arrays.sort(strcharArray);
                    Arrays.sort(str1charArray);
                    boolean result = Arrays.equals(strcharArray,str1charArray);
                    if(result){
                        System.out.println("Anagrams ");
                    } else{
                        System.out.println("Not Anagrams ");
                    }
                } else{
                    System.out.println("Not Anagrams ");
                }
    }
    public static void main(String[] args) {
        // Question - 1
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // countLowercase(str);

        //Question - 2
        System.out.println("Enter the string 1 and string 2");
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        checkAnagrams(str, str1);

    }
    
}
