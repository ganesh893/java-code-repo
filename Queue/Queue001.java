package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue001 {

	public static void main(String[] args) {

// checking queue program for clarrification
		Queue<Integer> q= new LinkedList<>();
		for(int i=0;i<=10;i++)
			q.add(i);
		// show content of queue
		System.out.println("Queue object :"+q);
		//will show first element of queue
		System.out.println("Queue pointing element :"+q.element());
		System.out.println("size :"+q.size());
		
		// to remove the head queue
		int remo=q.remove();
		System.out.println("removed element :"+remo);
		System.out.println("size :"+q.size());
		
		// to view peak element
		System.out.println("size :"+q.peek());
	}

}
