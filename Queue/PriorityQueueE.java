package Queue;

import java.util.*;

public class PriorityQueueE {

	public static void main(String[] args) {

Queue<Integer> pq= new PriorityQueue<>();

pq.add(10);
pq.add(20);
pq.add(15);
pq.add(12);
System.out.println(pq.peek());
System.out.println(pq.poll());
System.out.println(pq.peek());

	}

}
