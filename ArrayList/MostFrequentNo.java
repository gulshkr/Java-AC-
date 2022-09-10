//Most frequent number following key
//You are given an integers Arralylist nums. You are also given an integer key which is present in the nuns.
//For every unique integrs target in nums count the number of times target immediately follows an occured of key in nums in other words count the number of indices i such that
//Sample Input 1:nums = [1,100,200,1,100], key = 1 Sample Output 1:  100
// Explanation :For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.No other integers follow an occurrence of key, so we return 100
//is question me hume jo bhi key element diya ho us key  element ke baad jo bhi number sabse jaada baar frequently occur ho rha hai usse output krana hai - jaise isme key hai 1 toh 1 ke baad 100 hai jo ki sabse jaada baar occur ho rha hai
package ArrayList;

import java.util.ArrayList;

public class MostFrequentNo {
    public static int mostFrequentNo(ArrayList<Integer>nums,int key){
        int []result = new int[1000];
        for(int i =0;i<nums.size()-1;i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i =0;i<1000;i++){
            if(result[i]>max){
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int key =1;
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        System.out.println(mostFrequentNo(nums, key));
    }
    
}
