import java.util.*;
public class Try {
  public static int Duplicates(int nums[]){

    char n = '_';
    for(int i = 0;i<nums.length;i++){
      if(nums[i]==nums[i+1]){
        nums[i+1] = n;
      }
    }
    return nums[0];
  }
  public static void main(String[] args) {
    int nums[] = {1,1,2};
    System.out.println(Duplicates(nums));
    
    // char n = '_';
    // System.out.println(n);
  }
}



