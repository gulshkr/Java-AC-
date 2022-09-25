//Caesar cipher encryption is done by replacing each letter at 3 position to the left ?
public class co{
   
static String cipher(String msg, int shift){
    String s = "";
    int len = msg.length();
    for(int x = 0; x < len; x++){
        char c = (char)(msg.charAt(x) + shift);
        if (c > 'z')
            s += (char)(msg.charAt(x) - (26-shift));
        else
            s += (char)(msg.charAt(x) + shift);
    }
    return s;
}
   
public static void main(String[] args) {
   
   
   System.out.println(cipher("abc", 3));  //prints def
   System.out.println(cipher("xyz", 3));  //prints abc
   System.out.println(cipher("nrfzh",3));
}
}



