package Hashing;
import java.util.*;

import LinkedList.LinkedList;
public class HashmapImplementation {
    static class HashMap<K,V>{  //generic type - it can be like anything int, char , etc (K & V)
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int size; //n
        private LinkedList<Node> buckets[]; //N = buckets.length

         @SuppressWarnings("unchecked")  //this line will be needed in some version of java 
         public HashMap(){
            this.size  = 0;
            this.buckets = new LinkedList[4];
            for(int i = 0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
         }

         private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % size;
         }

         private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
         }
         public void put(K key, V value){
            int bi = hashFunction(key);  //0 to 3
            int di = SearchInLL(key); //valid or not present then -1
         }
    }
    public static void main(String[] args) {
        
    }
    
}
