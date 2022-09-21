package Stack;
import java.util.*;
//Practice Question - 2 - Simplify path - We have an absolute path for a file (Unix- style), simplify it. Note that absolute path always begin with '/' (root directory), a dot in path represent current directory and double dot represents parent directory ?

public class SimplifyPath {
    static String simplifypath(String path){
        String []arr = path.split("/");
        Stack <String> s = new Stack<>();
        for(String str:arr){
            if(str.equals(".")||str.length()==0){
                continue;
            } else if(str.equals("..")){
                if(s.size()>0){
                    s.pop();
                }
            } else{
                s.push(str);
            }
        }
        String ans =" ";
        while(s.size()>0){
            ans = "/"+s.pop()+ans;
        }
        if(ans.length()==0){
            ans="/";
        }
        return ans;
    }

    public static void main(String[] args) {
        String path = new String("/apnacollege/./");
        String result = simplifypath(path);
        System.out.println(result);
    }
}
