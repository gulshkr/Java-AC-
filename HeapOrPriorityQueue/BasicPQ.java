package HeapOrPriorityQueue;
import java.util.*;
//Basic of Priority queue for more see note page no 449
public class BasicPQ {
    static class Student implements Comparable<Student>{    //overriding
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();  
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());  //Comparator.reverse - it will reverse my order, It is also used in array.sort

        pq.add (new Student("A",4));  //O*(logn)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"-> "+pq.peek().rank);  //O(1)
            pq.remove(); //O(logn)
        }
    }
}
