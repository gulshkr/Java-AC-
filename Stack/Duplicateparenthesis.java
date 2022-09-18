package Stack;
import java.util.*;

import javax.security.auth.login.FailedLoginException;
// Question - 7 - Duplicate parenthesis - Given a balanced  expression, find if it contains duplicate parenthesis or not. A set of prenthesis are dupicate if the same subexpression is surrouded by multiple parenthesis. Return true if contains duplicate  else return false
//--remeember - there is no empty type cases as we will be given a valid string always
public class Duplicateparenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening, operator, operand
            //closing
            if(ch==')'){
                int count = 0;
                while( s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate
                } else{
                    s.pop(); //opening pair
                }
            } else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Valid string given
        String str = "((a+b))"; //true
        String str1 = "(a-b)";//false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
    
}
