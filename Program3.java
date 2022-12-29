// QUEUE ----> LAST IN FIRST OUT

import java.util.*;
class queueDemo{
	public static void main(String[]args){
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
		queue.offer(48);
		queue.offer(60);

		for(Integer ele : queue){
			System.out.print("|"+ele+"|");
		}

		System.out.println("");
	}
}

// add() ----> SAME AS OFFER()
//	       Insert element into queue.If task is successful,add() return true else throws exception
// element() ---> SAME AS PEEK() --> IT RETURN HEAD OF QUEUE.THROWS EXCEPTION IF QUEUE IS EMPTY
// 					---> PEEK() RETURN NULL VALUE
// remove()---> SAME AS POLL() --> REMOVE HEAD OF QUEUE.THROWS EXCEPTION IF QUEUE IS EMPTY
// 				---> POLL() RETURN NULL IF QUEUE EMPTY
