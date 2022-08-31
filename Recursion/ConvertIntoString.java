package Recursion;

public class ConvertIntoString {
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convertIntoString(int num){
        //Base case 
        if(num == 0){
            return;
        }
        //lastdigit
        int lastdigit = num%10;
        convertIntoString(num/10);
        System.out.print(digits[lastdigit]+" ");

    }
    public static void main(String[] args) {
        int num = 2019;
        convertIntoString(num);
    }
    
}
