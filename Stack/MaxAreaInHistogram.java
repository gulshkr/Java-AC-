package Stack;
import java.util.*;
//Question - 8 - Max Area in Histogram - Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram
public class MaxAreaInHistogram {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsr[i] = arr.length;
            } else{
                //top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                //-1
                nsl[i] = -1;
            } else{
                //top
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        //current area: width = j-i-1 = nsr[i] - nsl[i]-1
        for(int i =0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram = "+ maxArea);

    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; //heights in histogram
        maxArea(arr);
        
    }
    
}
