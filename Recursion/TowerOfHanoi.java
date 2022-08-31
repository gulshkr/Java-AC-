package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String Helper,String dest){
        //Base case 
        if(n==1){
            System.out.println("transfer disk "+ n +"from"+ src +"to"+ dest);
            return;
        }

        //Kaam
        towerOfHanoi(n-1, src, dest, Helper);
        System.out.println("transfer disk "+ n +"from"+ src +"to"+ dest);
        towerOfHanoi(n-1, Helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
        
    }
    
}
