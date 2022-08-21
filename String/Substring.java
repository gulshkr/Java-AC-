package String;
public class Substring {
    public static String findSubString(String str,int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(findSubString(str, 0, 4));
        //inbuilt function for substring 
        System.out.println(str.substring(0,5));
    }
    
}
