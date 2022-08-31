package Recursion;

public class CountSubstringSameStartEnd {
    public static int countSubstring(String str,int i ,int j,int n){
        //Base case
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }

        //Kaam
        int count = countSubstring(str, i+1, j, n-1)+countSubstring(str, i, j-1, n-1)-countSubstring(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstring(str, 0, n-1, n));
    }
    
}
