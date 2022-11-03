package Hashing;
import java.util.*;
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

        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; //N = buckets.length

         @SuppressWarnings("unchecked")  //this line will be needed in some version of java 
         public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
         }

         private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
         }

         private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;

            for(int i =0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
         }

         //Rehash
         private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];  
            N = 2 * N;
            for(int i =0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in bucket
            for(int i =0;i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j =0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
         }

         //put
         public void put(K key, V value){  //O(lambda) or O(1)
            int bi = hashFunction(key);  //0 to 3
            int di = SearchInLL(key,bi); //valid or not present then -1

            if(di !=-1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda>2.0){
                rehash();
            }
         }

         //Contain key function
         public boolean containsKey(K key){  //O(1)
            int bi = hashFunction(key);  //0 to 3
            int di = SearchInLL(key,bi); //valid or not present then -1

            if(di != -1){   //valid value
                return true;
            } else{
                return false;
            }
         }

         public V remove(K key){  //O(1)
            int bi = hashFunction(key);  //0 to 3
            int di = SearchInLL(key,bi); //valid or not present then -1

            if(di !=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else{
                return null;
            }
         }

         public V get(K key){  //O(1)
            int bi = hashFunction(key);  //0 to 3
            int di = SearchInLL(key,bi); //valid or not present then -1

            if(di !=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else{
                return null;
            }
         }

         public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i =0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
         }

         public boolean isEmpty(){
            return n==0;
         }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US", 50);
        hm.put("Germany", 20);   

        ArrayList<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
    
}
