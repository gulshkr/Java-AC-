

//Given an array nums, removing the triplets from last the relative order of the elements should be kept the same in java ?
public class co{
    public static void main(String[] args) {
        
    
int[] nums = {2,4,2,2,7,5,6,7,8,6,6,2,6,7,6};
int[] ans = new int[6];
int count=1; 
for(int i=0;i<nums.length;i++){
   for(int j=0;j<nums.length;j++){
     if(nums[i] == nums[j]){
        if(count < 3){
         count++;
         ans[i] = nums[j];
        }
     }
     System.out.print(ans[i]+" ");
   }
   System.out.println();
}
}
}