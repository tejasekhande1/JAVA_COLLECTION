
// ARRAY CHI SIZE DYNAMICALLY INCREASE NAHI HOT SO ARRAYLIST USE KELI JATE
// MEMORY INCRESES DYNAMICALLY IN ARRAY LIST
// SIZE INCREASE : n + n/2 + 1 ---> INTERNALLY INCREASES SIZE --> CREATE NEW ARRAY COPY OLD ARRAY INTO IT
// PARENT CLASS --> LIST
// SAME FOR LINKEDLIST

import java.util.*;
class ArrayListDemo{
	public static void main(String[]args){
	//	ArrayList<String> studName = new ArrayList<>();
	//	List<String> studName = new ArrayList<>();
		List<String> studName = new LinkedList<>();
		ArrayList<String> newStudName = new ArrayList<>();
		newStudName.add("100");
		newStudName.add("200");
		studName.add("TEJAS");
		studName.add("PRATIK");
		studName.add("CHAITANYA");
		System.out.println(studName);
		studName.add(1,"AVINASH");                      // add(index,element)
		System.out.println(studName);
		studName.addAll(newStudName);                // APPEND newStudName ELEMENTS IN studName
//		System.out.println(studName);            
//	   	System.out.println(studName.get(1));	
//		studName.remove(1);				-----> O(n)
//		studName.remove(String.valueOf("TEJAS"));                         ----> ELEMENT
//		studName.clear();                               ----> CLEAR LIST
/*		studName.set(2,"TEJA");                      // CHANGE/UPDATE (index,value)
		System.out.println(studName);
		System.out.println(studName.contains("TEJAS"));     // BOOLEAN VALUE
*/
		// FOR LOOP
		for(int i=0 ; i<studName.size() ; i++){
			System.out.println("Element : "+studName.get(i));
		}

		// FOR EACH
		for(String ele : studName){
			System.out.println(ele);
		}

		// ITERATOR
		Iterator<String> it = studName.iterator();
		while(it.hasNext()){			// hasNext() --> CHECK NEXT ELEMENT EXIST OR NOT
			System.out.println(it.next());     // next() --> TO ACCESS ELEMENTS
		}
	}
}
