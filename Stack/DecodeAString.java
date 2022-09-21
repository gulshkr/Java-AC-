package Stack;
import java.util.*;
//Practice problem - 3 - We have an encoded String s and the task is to decode it. The pattern in which the strings are encoded is as follows. //-imput- 2[cv] output- cvcv 
public class DecodeAString {
    static String decodeAString(String s){
        Stack<Integer> counStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();
        int number =0;
        StringBuilder word = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = number*10+(c-0);
            }else if(Character.isLetter(c)){
                word.append(c);
            } else if(c=='['){
                counStack.add(number);
                wordStack.add(word.toString());
                number = 0;
                word = new StringBuilder();
            }else{   //if it is closing square bracket then pop it out(])
                int count = counStack.pop();
                StringBuilder duplicateWord = new StringBuilder(wordStack.pop());
                word = duplicateWord;
            }
        }
        return word.toString();
    }
    public static void main(String[] args) {
        String s = "2[cv2[ab]]"; // --> cvcv
        String result = decodeAString(s);
        System.out.println(result);
    }
    
}
