// PRIORITY QUEUE --> Priority Queue is an abstract data type that is similar to a queue, and every element has some priority value associated with it. The priority of the elements in a priority queue determines the order in which elements are served (i.e., the order in which they are removed). If in any case the elements have same priority, they are served as per their ordering in the queue.

import java.util.*;
class pQueueDemo{
	public static void main(String[]args){
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); MIN->MAX HEAP
//		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(40);
		pq.offer(30);
		pq.offer(50);
		pq.offer(10);
		pq.offer(20);
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}

// MINIMUM ELEMENT ON TOP/HEAP AND IT HAS HIGH PRIORITY
